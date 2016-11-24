package andy.sdu.edu.cn.qqimitation;

import android.app.Application;
import android.util.Log;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVUser;
import com.avos.avoscloud.FollowCallback;
import com.avos.avoscloud.SaveCallback;
import com.avos.avoscloud.im.v2.AVIMClient;
import com.avos.avoscloud.im.v2.AVIMConversation;
import com.avos.avoscloud.im.v2.AVIMMessage;
import com.avos.avoscloud.im.v2.AVIMMessageHandler;
import com.avos.avoscloud.im.v2.AVIMMessageManager;
import com.avos.avoscloud.im.v2.messages.AVIMTextMessage;

import andy.sdu.edu.cn.qqimitation.activity.ConversationActivity;

import static android.content.ContentValues.TAG;

/**
 * Created by andy on 11/21/16.
 */

public class MyLeanCloudApp extends Application {

    public static final ConversationActivity.CustomMessageHandler customMessageHandler = new ConversationActivity.CustomMessageHandler();

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化参数依次为 this, AppId, AppKey
        AVOSCloud.initialize(this,"fDREVkCDOBGnezfCQgQLdBih-gzGzoHsz","yi9HPB8FhGpGzk4BaJDeGeQn");

        //注册默认的消息处理逻辑
        AVIMMessageManager.registerDefaultMessageHandler(customMessageHandler);

        // 测试 SDK 是否正常工作的代码
//        AVObject testObject = new AVObject("TestObject");
//        testObject.put("words","Hello World!");
//        testObject.saveInBackground(new SaveCallback() {
//            @Override
//            public void done(AVException e) {
//                if(e == null){
//                    Log.d("saved","success!");
//                }
//            }
//        });

    }

}
