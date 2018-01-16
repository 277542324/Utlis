# Utlis方法类使用指南
### OpenActManager（跳转Activity路由）
#### get().goActivity(_this，_class，map，mBundle)
|方法名|说明|
|:-------------|:-------------|
| _this|当前Activity|
| _class|目标Activity|
| map | 需传入HashMap<String,String>，此方法可以不填 |
| mBundle |传入Bundle构造方法，此方法可以不填|

### UtilsGson（解析Json的工具类）
#### GsonToBean（gsonString，cls）
|方法名|说明|
|:-------------|:-------------|
| gsonString|类型为String的Json值|
| cls|解析对应的Json的模型类|

### UtilsTools使用方法
|方法名|说明|
|:-------------|:-------------|
| getScreenWidth（获取屏幕宽度）|需传入当前Activity|
| getScreenHeight（获取屏幕高度度）|需传入当前Activity|
| liearlayoutviewsize<br>（动态设置LinearLayout包裹下的控件大小以及间距）|mContext（传入当前Activity）<br><br>view（传入需要设置的控件）<br><br>width（如是通过getScreenWidth获取大小就不用带上dip2px方法，则要带dip2px方法传入值）<br><br>height（如是通过getScreenWidth获取大小不用带上dip2px方法，则要带dip2px方法传入值）<br><br>left（可传可不传,直接填入int 0--xxx,无需使用dip2px方法包裹）<br><br>top（可传可不传,直接填入int 0--xxx,无需使用dip2px方法包裹）<br><br>right（可传可不传,直接填入int 0--xxx,无需使用dip2px方法包裹）<br><br>bottom（可传可不传,直接填入int 0--xxx,无需使用dip2px方法包裹）|
| frameLayoutViewsize<br>(同liearlayoutviewsize)|用法同liearlayoutviewsize|
| relativepositionsize<br>(同liearlayoutviewsize)|mContext（传入当前Activity）<br><br>view（传入需要设置的控件）<br><br>width（如是通过getScreenWidth获取大小就不用带上dip2px方法，则要带dip2px方法传入值）<br><br>height（如是通过getScreenWidth获取大小不用带上dip2px方法，则要带dip2px方法传入值）<br><br>left（可传可不传,直接填入int 0--xxx,无需使用dip2px方法包裹）<br><br>top（可传可不传,直接填入int 0--xxx,无需使用dip2px方法包裹）<br><br>right（可传可不传,直接填入int 0--xxx,无需使用dip2px方法包裹）<br><br>bottom（可传可不传,直接填入int 0--xxx,无需使用dip2px方法包裹）<br><br>RuleStatus（使用绝对定位填入-1，使用位于控件填入-2）<br><br>addRule（绝对定位传入值）<br>----------RelativeLayout.ALIGN_PARENT_TOP（上）<br>----------RelativeLayout.ALIGN_PARENT_BOTTOM（下）<br>----------RelativeLayout.ALIGN_PARENT_LEFT（左）<br>----------RelativeLayout.ALIGN_PARENT_RIGHT（右）<br>----------RelativeLayout.ABOVE（位于给定ID控件之上，配合Rid使用即控件ID）<br>----------RelativeLayout.BELOW（位于给定ID控件之下，配合Rid使用即控件ID）<br><br>Rid（使用ABOVE、BELOW，必须填入控件ID）|
| edittextviewselection<br>(输入框光标移动到最后)|view（EditText）<br><br>length(EditText中内容的长度)|
| callPhone（调起拨打电话提示）|mContext（传入当前Activity）<br><br>phone（需要拨打电话号码）<br><br>titleMsg（提示标题头）<br><br>msg（提示内容）<br><br>titleSize（提示标题字体Size）<br><br>contentSize（提示内容字体Size）|
| TextStyle(动态设置text的字体大小及颜色)|mContext（当前Activity）<br><br>textString（当前内容）<br><br>tSize （字体大小）<br><br>mColor（字体颜色）<br><br>startSize（起始位置）<br><br>endSize（ 终止位置）<br><br>tv（控件ID）|
| drawableLeftTextSize<br>(图片位置TextView的左)|mContext（当前Activity）<br><br>icon（图片）<br><br>width（图片宽度）<br><br>height（图片高度）<br><br>view（控件ID）|
| drawableRightTextSize<br>(图片位置TextView的右)|用法同上|
| drawableRightTextSize<br>(图片位置TextView的左右)|用法同上|
| analysisJSONObject(解析JSON)|obj（数据类型为JSON的数据)）<br><br>res（JSON对应的键值对）|
| viewWidth(获取控件宽度)|view（需要获取控件宽度的控件）|
| viewHeight(获取控件高度)|view（需要获取控件高度的控件）|
| StatusBarLightMode<br>(状态栏亮色模式，设置状态栏文字、图标颜色)|activity（当前Activity）<br><br>state 布尔类型：true-状态栏为白色 or false-状态栏为白色|
| isWifi(判断是否在Wifi状态下)|activity（当前Activity）|
| isNetworkConnected<br>(判断网络是否畅通)|activity（当前Activity）|
| getAppVersionName<br>(获取App VersionName)|activity（当前Activity）|
| getAppPackageName<br>(获取App PackageName)|activity（当前Activity）|
