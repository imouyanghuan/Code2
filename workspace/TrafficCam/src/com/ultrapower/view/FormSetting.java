/**
//VideoIM文档生成日期：2005.10.12
//
//(1)概述：
//类名称：FormSetting
//类说明：
//	提供设置关于本应用所需要的几个参数的Form
* 
//所在子系统：VideoIM
//
//系统总描述:
	    我们提供的VideoIM手机自动拍照上传器J2ME版本[开源]是
	    一个可以下载到手机(例如Nokia7610已经确实可以下载安装并正常运行)的应用程序，
	    用来自动驱动手机摄像头定时拍摄,并后台将JPEG图像(很小，大约几KB)上传到服务器上，
	    这样就可以帮助其他系统工作，比如PC机上的MSN Messenger可以和你的移动MSN Messenger
	    通过这种方式视频聊天，对方可以每隔十几秒钟看到你的手机所看到的画面了。

	 子系统描述：
		VideoIM的功能列表：
			1:我要MobileWebCam
				启动MobileWebCam
				停止MobileWebCam
			2:MobileWebCam设置
			3:关于我
			4:退出


//(2)历史记录:
//创建人: 郑昀(2005.10.12)
//联系我: Google Talk >> zhengyun@gmail.com
//Blogs:    http://blog.csdn.net/zhengyun_ustc/以及http://www.cnblogs.com/zhengyun_ustc

//(3)版权声明:
//由于我这个版本的VideoIM手机自动拍照上传器也是基于Mowecam的设计理念基础上改编而来的，
//所以决定遵照GPL协议的大意开放源代码，您可以自由传播和修改，在遵照GPL协议的约束条件的前提下。

//(4)相关资源:
1：《[J2ME]VideoIM手机自动拍照上传器开源说明》
2：《[J2ME]VideoIM手机自动拍照上传器设计说明》
3：下载源代码：

////////////////////////////////////////////////////////////////////*/
package com.ultrapower.view;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

import com.ultrapower.common.CommandResources;
import com.ultrapower.control.GUIController;
import com.ultrapower.midlet.TrafficView;
import com.ultrapower.model.VideoSettings;


/**********************************************************
//FormSetting
//
//Class Description:
//	提供设置关于本应用所需要的几个参数的Form
//
//Author:
// zhengyun@ultrapower 2005.10.12
//
**********************************************************/
public final class FormSetting extends Form
{
	private GUIController controller;
	
    private TextField m_txtDownload3gpFileSiteURL;
	private TextField m_txtMyConvertServerURL;
	private TextField m_txtLiveMediaTimeLimit;
	private VideoSettings settings;

    private static final Command m_cmdBack = 
		new Command(
				String.valueOf(CommandResources.getChars(
						CommandResources.TXT_C_BACK)), 3, 0);
    private static final Command m_cmdSave = 
		new Command(String.valueOf(CommandResources.getChars(
				CommandResources.TXT_C_SAVESETTINGS)), 4, 1);

    public FormSetting(GUIController control)
    {
        super(String.valueOf(CommandResources.getChars(
				CommandResources.TXT_T_SETTINGS)));
		controller	=	control;
    	this.setCommandListener(new FormSettingListener());
        
        addCommand(m_cmdBack);
        addCommand(m_cmdSave);
    }
	
	/*
     * 内部监听器，监听器监听所有Command事件，并把事件响应推出来让控制器处理
     */
    private class FormSettingListener implements CommandListener{ 
		public void commandAction(Command command, Displayable disp){
			if(command == m_cmdBack){
				controller.handleEvent(GUIController.EventID.EVENT_SETTINGS_BACK, null);
	        }
			else if(command == m_cmdSave){
				System.out.println("FormSettingListener::cmdSave");
	            String file3gpURL		=	m_txtDownload3gpFileSiteURL.getString();
				//System.out.println("1" + type);
	            String convertURL	=	m_txtMyConvertServerURL.getString();
				//System.out.println("2" + width);
				String timeLimit	=	m_txtLiveMediaTimeLimit.getString();
               
				Object[] args = {file3gpURL, convertURL, timeLimit};
				controller.handleEvent(GUIController.EventID.EVENT_SETTINGS_SAVE, args);    	                    	            
			}//end else
		}
    }//end inner class

    public void initSettingsTextFields()
    {
		System.out.println("Enter FormSetting::initSettingsTextFields");
		settings = VideoSettings.getInstance();
		m_txtDownload3gpFileSiteURL = new TextField("下载3gp流媒体服务器地址:", 
				String.valueOf(settings.getDownload3gpFileSiteURL()), 64, TextField.URL);
		m_txtMyConvertServerURL = new TextField("转换3gp服务器地址:", 
				String.valueOf(settings.getMyConvertServerURL()), 64, TextField.URL);
		
		m_txtLiveMediaTimeLimit = new TextField("实况录像的秒数[建议设为小于10的正整数,单位:秒]:", 
				String.valueOf(settings.getLiveMediaTimeLimit()), 2, TextField.DECIMAL);
				
        TextField SettingsFields[] = {
				m_txtDownload3gpFileSiteURL,
				m_txtMyConvertServerURL,
				m_txtLiveMediaTimeLimit,
        };
		
        for(int i = 0; i < SettingsFields.length; i++)
            append(SettingsFields[i]);

    }

}
