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
|方法名|
|方法名|说明|
|:-------------|:-------------|
| gsonString|类型为String的Json值|
| cls|解析对应的Json的模型类|
* GsonToBean（gsonString，cls）
* gsonString（类型为String的Json值）
* cls（解析对应的Json的模型类）
<br><br>
### UtilsTools使用方法
* getScreenWidth （获取屏幕宽度，需传入当前Activity）<br>

* getScreenHeight （获取屏幕高度度，需传入当前Activity）<br>
* liearlayoutviewsize （动态设置LinearLayout包裹下的控件大小以及间距，需传入以下方法）
  * mContext（传入当前Activity）
  * view（传入需要设置的控件）
  * width（如是通过getScreenWidth获取大小就不用带上dip2px方法，则要带dip2px方法传入值）
  * height （如是通过getScreenWidth获取大小不用带上dip2px方法，则要带dip2px方法传入值）
  * left （直接填入int 0~xxx,无需使用dip2px方法包裹）
  * top（直接填入int 0~xxx,无需使用dip2px方法包裹）
  * right（直接填入int 0~xxx,无需使用dip2px方法包裹）
  * bottom（直接填入int 0~xxx,无需使用dip2px方法包裹）
* frameLayoutViewsize（用法同上）
* relativepositionsize（动态设置Relativepositionsize包裹下的控件大小以及间距，需传入以下方法）
  * mContext（传入当前Activity）
  * view（传入需要设置的控件）
  * width（如是通过getScreenWidth获取大小就不用带上dip2px方法，则要带dip2px方法传入值）
  * height （如是通过getScreenWidth获取大小不用带上dip2px方法，则要带dip2px方法传入值）
  * left （直接填入int 0~xxx,无需使用dip2px方法包裹）
  * top（直接填入int 0~xxx,无需使用dip2px方法包裹）
  * right（直接填入int 0~xxx,无需使用dip2px方法包裹）
  * bottom（直接填入int 0~xxx,无需使用dip2px方法包裹）
  * RuleStatus（使用绝对定位填入-1，使用位于控件填入-2，不使用填入0）
  * addRule （绝对定位传入值）
    * RelativeLayout.ALIGN_PARENT_TOP（上）
    * RelativeLayout.ALIGN_PARENT_BOTTOM（下）
    * RelativeLayout.ALIGN_PARENT_LEFT（左）
    * RelativeLayout.ALIGN_PARENT_RIGHT（右）
    * RelativeLayout.ABOVE（位于给定ID控件之上，配合Rid使用即控件ID）
    * RelativeLayout.BELOW（位于给定ID控件之下，配合Rid使用即控件ID）
  * Rid （使用ABOVE、BELOW，必须填入控件ID，不使用则填入0）
* edittextviewselection （输入框光标移动到最后）
   * view（EditText）
   * length (EditText中内容的长度)
* callPhone（调起拨打电话提示）
   * mContext（传入当前Activity）
   * phone（需要拨打电话号码）
   * titleMsg（提示标题头）
   * msg（提示内容）
   * titleSize（提示标题字体Size）
   * contentSize（提示内容字体Size）
