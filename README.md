# zftlive

这是一个集成目前Android主流优秀第三方组件、优秀好用的自定义控件、实用工具类封装、以及一些APP共通模块（比如：版本更新、意见反馈、引导界面、基础的本地数据库操作、网络通信、图片加载等功能）的开发包，帮助程序员快速开发自己的APP

#如何使用

 1. 环境准备：Eclipse Kepler  + ADT23 + Android SDK 4.4.2 (19) + git 
   请确保本地含有Android SDK4.4.2，如果没有可以更新SDK，更新资源使用代理或者翻墙。[国内Android开发相关资源][15]，可以不用翻墙。懒得搭建环境的同学，可以去下载[作者的集成环境][16]，下载解压查看readme.txt安装 

 2. 安装编译
    - 说明：zftlive最新版本将共性的base/tools/widget抽取成独立类库【AjavaAndroidLib】，主要是方便使用以及维护，sample引用该工程使用。开发者可以直接签出类库工程即可，查看具体如何使用以及相关写法可下载sample
    - 最新代码托管在OSC：zftlive这个是最初始版本，维护不是那么及时，[Eclipse版本][17]，[AndroidStudio版本][18]；AjavaAndroidLib，依赖该类库，在应用**AndroidManifest.xml**配置*MApplication或其子类*即可使用，[Eclipse版本][19]，[AndroidStudio版本][20]；AjavaAndroidLib使用Sample工程下载地址：[Eclipse版本][21]，[AndroidStudio版本][22]。直接使用git签出到同一个workspace目录，git如何使用签出工程可以观看作者录制的[教程][23]

#集成组件

 - [x] 网络异步请求[android-async-http][1]
 - [x] 图片异步加载[universal-image-loader][2]
 - [x] 本地数据库操作[ormlite-android][3]
 - [x] 消息推送-[腾讯信鸽][4]
 - [ ] 即时通讯-[环信][5]
 - [ ] 地图基础+定位+LBS [百度地图][6]
 - [x] App埋点/崩溃异常跟踪/日活统计[腾讯MTA][7]
 - [x] 社会化分享/第三方账号联合登录/短信验证码[ShareSDK][8]
 - [x] 快速生成渠道包[MultiChannelBuildTool][9]
 - [x] 二维码/条形码扫描和生成[Zxing二维码库][10]
 - [x] 低版本动画兼容库[nineoldandroids][11]
 - [x] IOC注入布局layout/控件/事件/Android四大组件[RoboGuice][12]
 - [x] WebService异步请求接口调用库[ksoap2][13]
 - [x] JSON/Bean互转组件 [gson][14]
 - [x] 折线图/饼图/柱状图/图表控件AChartEngine

#样例锦集

 - 共通界面-引导界面
 - 共通界面-意见反馈
 - 共通界面-本地/服务器WEB页加载界面（带进度显示+获取网页标题+分享）
 - 共通机能-版本检测升级
 - 共通机能-消息推送
 - 共通机能-MTA埋点/异常崩溃监控
 - 共通机能-全程网络状态监听Service
 - 样例-ActionBar标题栏
 - 样例-底部弹出泡泡菜单
 - 样例-Achartengine带泡泡提示的曲线图
 - 样例-异步加载图片+防错位DEMO
 - 样例-直接启动摄像头拍照
 - 样例-Sqlite增删改查操作
 - 样例-生成二维码/验证码（可带LOGO图片）
 - 样例-竖屏扫描二维码/条形码
 - 样例-调用WebService示例
 - 样例-发送手机短信验证码
 - 样例-垂直+水平+圆形进度条
 - 样例-自动获取表单数据示例
 - 样例-Activity切换过场动画示例
 - 样例-发送短信/拦截示例
 - 样例-基本常用操作-跳转至WIFI设置、联系人、相册选择等界面
 - 样例-DrawerLayout侧滑菜单
 - 样例-水平/垂直滚动+首行首列固定+翻页Listview
 - 样例-下拉背景回弹效果的ScrollView
 - 样例-FadingActionBar官方DEMO（随着滑动ActionBar背景渐变）
 - 样例-PullToReresh官方DEMO
 - 样例-任何设备正方形Item的网格
 - 样例-带进度显示文件上传/下载
 - 样例-JNI/Java实现图片高斯模糊
 - 样例-dialog各种特效DEMO
 - 样例-带数字的进度条
 - 样例-百度地图定位演示

#封装工具类

 - HTTP网络通信工具类（ToolHTTP.java）,get/post请求，支持多种接口回调
 - SOAP协议通信工具类（ToolSOAP.java）,基于异步回调请求WebService接口
 - Sqlite数据库操作工具类（ToolDatabase.java），获取DAO、创建表、删除表等API
 - 提示信息对话框工具类（ToolAlert.java）,已集成泡泡、土司、对话框三种提示
 - 文件操作工具类（ToolFile.java）,assets/raw/xml/shrePerface/等文件读写API
 - 地图定位工具类（ToolLocation.java）,读取GPS状态、请求定位、获取经纬度等方法
 - 社会化分享工具类（ToolShareSDK.java）,各大开发平台分享API操作
 - 短信验证码工具类（ToolMSM.java）,移动/联通/电信三网发送手机短信验证码、异步回调验证结果
 - 字符串操作工具类（ToolString.java）,生成UUID、非空非NULL逻辑判断、生成MD5等常用共通方法
 - 数据操作工具类（ToolData.java）,自动递归获取表单数据封装成Map、本地数据分页共通方法等
 - 图片操作工具类（ToolPicture.java）,生成二维码、验证码、灰度、合成、圆角、水印等操作
 - 读取本地资源工具类（ToolResource.java）,反射本地资源文件API，避免依赖R文件，方便jar形式发布
 - Android单位转换工具类（ToolUnit.java）,sp/dp/px互转
 - 自定义Toast工具类（ToolToast.java）,自定义背景色、字体颜色、大小、边框等
 - Properties操作工具类（ToolProperties.java）,读写Properties文件操作
 - 网络操作工具类（ToolNetwork.java）,获取网络信息、更改切换网络等相关操作
 - 日期操作工具类（ToolDateTime.java）,获取日期、日期加减、格式化日期、日期转换等操作
 - XML操作工具类（ToolXml.java）,基于DOM/XMLPullPaser模式解析、生成XML操作
 - 适配字体工具类（ToolAutoFit.java）,代码根据设备密度自动缩放View的字体大小
 - LOG相关工具类（ToolLog.java） 

----------
#关于作者

```javascript
var Author = {
    realName : '曾繁添',
    nickName : 'Ajava攻城师',
    job : 'Android研发工程师 @ 京东金融'
    qq : '1260128980',
    email : 'zftlive@163.com',
    website : 'http://www.zftlive.com',
    blog : 'http://www.cnblogs.com/fly100',
    github : 'https://github.com/zengfantian',
    oschina : 'http://git.oschina.net/zftlive',
    tags : '90后、IT男、技术控、代码洁癖',
    description : '爱技术、爱开源、也爱赚钱，对代码书写有严格规范要求洁癖，平时喜欢看看开源项目、SDK相关源代码'
}
```

[1]: https://github.com/loopj/android-async-http
[2]: https://github.com/nostra13/Android-Universal-Image-Loader
[3]: http://ormlite.com/
[4]: http://xg.qq.com/xg/
[5]: http://www.easemob.com/sdk/
[6]: http://developer.baidu.com/map/
[7]: http://mta.qq.com/
[8]: http://mob.com/
[9]: http://git.oschina.net/zftlive/zftlive/tree/master/python
[10]: https://github.com/zxing/zxing/
[11]: https://github.com/JakeWharton/NineOldAndroids
[12]: http://code.google.com/p/google-guice/
[13]: https://github.com/simpligility/ksoap2-android
[14]: code.google.com/p/google-gson/downloads/list
[15]: http://www.androiddevtools.cn/
[16]: http://yun.baidu.com/share/link?shareid=42299917&uk=705493881
[17]: http://git.oschina.net/zftlive/zftlive
[18]: http://git.oschina.net/zftlive/gradle-zftlive
[19]: http://git.oschina.net/zftlive/AjavaAndroidLib
[20]: http://git.oschina.net/zftlive/gradle-ajavasample/tree/master/AjavaAndroidLib
[21]: http://git.oschina.net/zftlive/AjavaAndroidSample
[22]: http://git.oschina.net/zftlive/gradle-ajavasample
[23]: http://yun.baidu.com/share/link?shareid=1394255543&uk=705493881