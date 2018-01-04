# Utlis方法类使用指南
### OpenActManager（跳转Activity路由）
* get().goActivity(_this，_class，map，mBundle)----如只需单单跳转Activity，map、mBundle传入“null”即可
* _this（当前Activity）
* _class（目标Activity）
* map（intent.putExtra(key,value)）
  * key（键值）
  * value （传递的值）
* mBundle (传入Bundle构造方法)
<br><br>
### UtilsGson（解析Json的工具类）
* GsonToBean（gsonString，cls）
* gsonString（类型为String的Json值）
* cls（解析对应的Json的模型类）
<br><br>
### UtilsTools使用方法
* getScreenWidth （获取屏幕宽度，需传入当前Activity）
* getScreenHeight （获取屏幕高度度，需传入当前Activity）
* liearlayoutviewsize （动态设置LinearLayout包裹下的控件大小以及间距，需传入以下方法）
  * mContext（传入当前Activity）
  * view（传入需要设置的控件）
  * width（如是通过getScreenWidth获取大小就不用带上dip2px方法，则要带dip2px方法传入值）
  * height （如是通过getScreenWidth获取大小不用带上dip2px方法，则要带dip2px方法传入值）
  * left （直接填入int 0~xxx,无需使用dip2px方法包裹）
  * top（直接填入int 0~xxx,无需使用dip2px方法包裹）
  * right（直接填入int 0~xxx,无需使用dip2px方法包裹）
  * bottom（直接填入int 0~xxx,无需使用dip2px方法包裹）
