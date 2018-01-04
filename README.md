# Utlis方法类使用指南
>OpenActManager（跳转Activity路由）
>>get().goActivity(_this,_class,map,mBundle)--如只需单单跳转Activity,map、mBundle传入“null”即可
* _this（当前Activity）
* _class（目标Activity）
* map（intent.putExtra(key,value)）
  * key（键值）
  * value （传递的值）
* mBundle (传入Bundle构造方法)
