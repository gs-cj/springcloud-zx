(function($){
//文本框必填函数
$.fn.requireText = function(options){
    var defaults={
        exp:/^[^\n]{6,15}$/,//正则表达式
        message:"6至15位字母、数字",//消息内容
        idFold:"",//相关的折叠块ID号
        idFoldClick:"",//出发折叠的元素ID号
        closedText:"折叠",
        fn:function(sender){return true;},//默认业务处理函数委托
        bExp:true,//是否启用正则
        prompt:false,//是否弹出消息
        folding:false,//是否启用折叠块,于idFold相关
        focus:false,//是否定位
        backcolor:true
    };
    var options = $.extend(defaults, options);
    var tempCurrent = $(this);
    var value = $.trim($(tempCurrent).val());
    
    if(value.length ==0 ||  (options.bExp==true? !options.exp.test(value):false)
     || options.fn(tempCurrent) == false)
    {   
        if(options.folding == true && options.idFold !="")
        {
            $(options.idFold).show();
            $(options.idFoldClick).text(options.closedText);
            $(options.idFoldClick).attr("show","true");//参照folding方法
        }
        if(options.prompt ==true)
        {
	        alert(options.message);
        }
        if(options.focus ==true)
        {
            $(tempCurrent).focus();
        }
       
//        if(options.backcolor ==true)
//        {
//            $(tempCurrent).css("background-color", "Yellow");
//        }
//     
//        $(tempCurrent).change(function () {if($.trim($(tempCurrent).val()).length > 0){$(tempCurrent).css("background-color",""); }});
        
        return false;
    }
    
    return true;
};

//复选框必填函数
$.fn.requireCheckbox = function(options){
    var defaults={
        prompt:false,//是否弹出提示
        message:"请选择复选框。"//消息内容
    };
    var options = $.extend(defaults, options);
    var tempCurrent = $(this);
    if($(tempCurrent).attr("checked") != true)
    {
        if(options.prompt ==true)
        {
	        alert(options.message);
        }
        return false;
    }
    return true;
};

//单选框必填函数
$.fn.requireSelect = function(options){
    var defaults={
        nullValue:"",//空值
        withOther:false,//是否带其它选项
        idOther :"input",//其它对应的文本选择ID
        otherValue :"其它",
        prompt:false,//是否弹出提示
        message:"请选择复选框。",//消息内容
        focus:false,//是否定位
        folding:false,//是否启用折叠块,于idFold相关
        idFold:"",//相关的折叠块ID号
        idFoldClick:"",//出发折叠的元素ID号
        closedText:"折叠"
    };
    var options = $.extend(defaults, options);
    var tempCurrent = $(this);
    var value = $.trim($(tempCurrent).val());
    if(value == options.nullValue)//默认没选
    {
        if(options.folding == true && options.idFold !="")
        {
            $(options.idFold).show();
            $(options.idFoldClick).text(options.closedText);
            $(options.idFoldClick).attr("show","true");//参照folding方法
        }
        if(options.prompt ==true)
        {
            alert(options.message);
        }
        if(options.focus ==true )
        {
            $(tempCurrent).focus();
        }

        return false;
    }
    else if(value==options.otherValue && options.withOther ==true && options.idOther !="")
    {
        var otherId = "#"+$(tempCurrent).attr("id")+"+"+options.idOther;
        var value =$.trim($(otherId).val());
        if(value == "")
        {
            if(options.folding == true && options.idFold !="")
            {
                $(options.idFold).show();
            }
            if(options.prompt ==true)
            {
                alert(options.message);
            }
            if(options.focus ==true )
            {
                $(otherId).focus();
            }
            return false;
        }
    }   
    return true;
};

//文件上传校验
$.fn.checkUpload = function(options){
    var defaults ={
        reg:/.+(?:\.)(jpg|gif)$/,
        message:"请输入合适的图片类型。"
    };
    var options = $.extend(defaults,options);
    var tempCurrent = $(this);
    var value = $(tempCurrent).val();
    if(!options.reg.test(value.toLowerCase()))
	{
		alert(options.message);
		return false;
	}
	return true;
};


//值比较函数
$.fn.compare = function(options){
    var defaults={
        idCtr:"#foo"//要比较的控件ID，如:#Id
    };
    var options = $.extend(defaults, options);
    var tempCurrent = $(this);
    var firstValue = $.trim($(tempCurrent).val());
    var secondValue = $.trim($(options.idCtr).val());
    if(firstValue != secondValue)
    {
        return false;
    }
    return true;
};

//根据下来【其它】选项显示相关文本
$.fn.showOtherInputText = function(options){
    var defaults={
        otherValue:"其它",//其它选项的值
        idOther:"input"//紧跟的文本默认用标签获取
    };
    var options = $.extend(defaults, options);
    var tempCurrent = $(this);
    var value = $.trim($(tempCurrent).val());
    var otherId = "#"+$(tempCurrent).attr("id")+"+"+options.idOther;
    if(value != options.otherValue)
    {
        $(otherId).hide();
        return false;
    }
    else
    {
        $(otherId).show();
    }
};
       
 //折叠
$.fn.folding = function(options){
    var defaults={
        flagAttr:"show",//其它选项的值
        idWraps:"[]",//要操作的块，数组形式
        eventName:"click",//默认事件名
        openedText:"展开",
        closedText:"折叠",
        fixFrameFn: setFramSetHight,//修复TRS框架宽度
        fn:function(event){
                var showValue = $(event.currentTarget).attr("show");

                if( showValue =="true" || showValue ==undefined)
                {
                    $.each(event.data.actions,function(key,value){
                        $(value).hide();
                    });
                    event.data.fixFrameFn();   
                    $(event.currentTarget).attr("show","false");
                    $(event.currentTarget).text(options.openedText);
                }
                else
                {                  
                    $.each(event.data.actions,function(key,value){
                        $(value).show();
                    });
                    event.data.fixFrameFn();   
                    $(event.currentTarget).attr("show","true");
                    $(event.currentTarget).text(options.closedText);
                }
            }
        };
    var options = $.extend(defaults, options);
    var tempCurrent = $(this);
    $(tempCurrent).attr("href","javascript:void(0)");
    $(tempCurrent).bind(options.eventName,{actions:options.idWraps,fixFrameFn:options.fixFrameFn},options.fn);      
};

//限制内容
$.fn.limitContent = function(options){
    var defaults={
         length:2000,//限制2000字符
         reflash:100,//定时器刷新时间
         idTip:"span",
         fn:function(event,idTip,limitLength){
            var value = $.trim($(event.currentTarget).val());
            var tipId = "#"+$(event.currentTarget).attr("id")+"+"+idTip;
            if(value.length > limitLength )
            {
                value = value.substr(0,limitLength);
                $(event.currentTarget).val(value);
                $(tipId).css("color","#ff0000");
            }
            else
            {
                $(tipId).css("color","#000000");
            }
            $(tipId).text("允许"+limitLength+"字符,已输入"+value.length+"字符。");
            setFramSetHight(); 
          }
        };
    var options = $.extend(defaults, options);
    var tempCurrent = $(this);
    var getCharSum = function(event)
    {
        var tempIdTip = event.data.idTip;
        var tempLength = event.data.length;
        setTimeout(function(){options.fn(event,tempIdTip,tempLength)},options.reflash);   
    };
    
    $(tempCurrent).bind("keydown",{idTip:options.idTip,length:options.length}, getCharSum);    
    $(tempCurrent).bind("change",{idTip:options.idTip,length:options.length}, getCharSum); 
};

 //设置是否显示
$.fn.judgeDisplay = function(options){
    var defaults={
         nullValue:""
    };
    var options = $.extend(defaults, options);
    var tempCurrent = $(this);
    if($(tempCurrent).val() == options.nullValue)
    {
        $(tempCurrent).hide();
    }
};

//错误提示
$.fn.errorTip = function(options){
    var defaults={
         message:"",//错误消息
         color:"red",//提示颜色
         idError:"+span"//错误的HTML ID
    };
    var options = $.extend(defaults, options);
    var tempCurrent = $(this);
    var errSpanId = "#"+$(tempCurrent).attr("id")+options.idError;
    $(errSpanId).css("color",options.color);
    $(errSpanId).html(options.message);
};

//重置提示
$.fn.clearTip = function(options){
    var defaults={
         message:"",//错误消息
         color:"",//提示颜色
         idError:"+span"//错误的HTML ID
    };
    var options = $.extend(defaults, options);
    var tempCurrent = $(this);
    var errSpanId = "#"+$(tempCurrent).attr("id")+options.idError
    $(errSpanId).css("color",options.color);
    $(errSpanId).html(options.message);
};

 //添加第一选项
$.fn.addFirstOption = function(options){
    var defaults={
         text:"",
         value:""
    };
    var options = $.extend(defaults, options);
    var tempCurrent = $(this);
    $(tempCurrent).append("<option selected=\"selected\" value=\""+options.value+"\">"+options.text+"</option>");
};

//末尾添加其它项
 $.fn.addLastOption = function(options){
    var defaults={
         text:"其它",
         value:"其它"
    };
    var options = $.extend(defaults, options);
    var tempCurrent = $(this);
    $(tempCurrent).append("<option value=\""+options.value+"\">"+options.text+"</option>");
};

//单选框变化
$.fn.switchRadio = function(options){
    var defaults={
         value:"",//当前值才变化
         controls:"[]",//数据集
         fixFrameFn: setFramSetHight,//修复TRS框架宽度
         fn:function(event)
         {
            var currentValue = $(event.currentTarget).find(":radio:checked").val();
            if(currentValue == event.data.compareValue)
            {
                $.each(event.data.controls,function(index,item){
                    $(item).show();
                });
            }
            else
            {
                 $.each(event.data.controls,function(index,item){
                    $(item).hide();
                });
            }
            event.data.fixFrame();
         }
    };
    var options = $.extend(defaults, options);
    var tempCurrent  = $(this);

    $(tempCurrent).bind("change",{compareValue:options.value,controls:options.controls,fixFrame:options.fixFrameFn},options.fn);
};
})(jQuery);

function setFramSetHight() 
{
    var obj = parent.document.getElementById("showframe");    
    var height = 400;  
    if(obj==null)
        return;
    try {                     
        //  document.compatMode有两个值，BackCompat（Quirks Mode）和CSS1Compat（Standards Mode），
        //如果文档是标准模式就返回CSS1Compat，如果是怪异模式则返回BackCompat 
        if (obj.contentWindow.document.compatMode == "CSS1Compat") 
        {  
            if (navigator.userAgent.toUpperCase().indexOf('MSIE') >= 0)
            {
                height = obj.contentWindow.document.documentElement.scrollHeight; //clientHeight; 
            } 
            else
            {
                height = obj.contentWindow.document.documentElement.offsetHeight;
            }
        }  
        else 
        {
            if (navigator.userAgent.toUpperCase().indexOf('MSIE') >= 0)
            {  
                height = obj.contentWindow.document.body.scrollHeight; 
            }
            else
            {
                height = obj.contentWindow.document.body.offsetHeight;
            }
        }  
                   
        if (height < 400) {
            height = 400;
        }                
        
        if (navigator.userAgent.toUpperCase().indexOf('MSIE') >= 0)
        {
            parent.document.all("showframe").style.height= height;
        }
        else
        {
            top.window.document.getElementById("showframe").setAttribute('style', 
                'display: inline; overflow: visible; height:'+ height + 'px');
        }   
    } 
    catch (ex) 
    { 
        if (navigator.userAgent.toUpperCase().indexOf('MSIE') >= 0)
        {
            parent.document.all("showframe").style.height= height;
        }
        else
        {
            top.window.document.getElementById("showframe").setAttribute('style', 
                'display: inline; overflow: visible; height:'+ height + 'px');
        }   
    }
}