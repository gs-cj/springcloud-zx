$(function(){
	    setviewreserve()
	    function setviewreserve(){
		    var reserveheight=$("#reserve-pd40").innerHeight();
		    var reserveheboxhei=getviewheight()-getheadheight()-getbanerheight()-240;
		    var setboxheight=reserveheboxhei-204;
		    var showfalseheight=getviewheight()-getheadheight()-getbanerheight()-280;
		    //新增加的
		    //6.23
    	
		    var divHeight=$(".menu-arr-width").height()
		    var iframeBox=$(".iframe-box").height();
		    if(iframeBox<divHeight){
			    var objheight=divHeight-$(".right-head").height()-$(".reserve-content-foot").innerHeight()-40;
			    $(".content").css("height",objheight);
			    $(".js-contentcolor").css("height",showfalseheight)
		    }	
    		
		    //新增加6.24出现错误页面
    		
		    setshowfalse();
		    function setshowfalse(){
			    $(".false-content").css("height",showfalseheight);
		    }	
		    //新增加6.24右侧最小高度	
		    setreservebox();
		    function setreservebox(){
			    if(reserveheboxhei>reserveheight){
				    $(".reserve-content-lis").css("height",setboxheight)
				    }
		    }
		    function getviewheight(){
		    return $(window).height()
		    }
		    function getheadheight(){
			    return $(".head-fix").innerHeight();
		    }
		    function getbanerheight(){
			    return $("#ie-mt80-box").height();
		    }
	    }




			var userAgent = navigator.userAgent.toLowerCase(); 
			// Figure out what browser is being used 
			jQuery.browser = { 
			version: (userAgent.match( /.+(?:rv|it|ra|ie)[\/: ]([\d.]+)/ ) || [])[1], 
			safari: /webkit/.test( userAgent ), 
			opera: /opera/.test( userAgent ), 
			msie: /msie/.test( userAgent ) && !/opera/.test( userAgent ), 
			mozilla: /mozilla/.test( userAgent ) && !/(compatible|webkit)/.test( userAgent ) 
			}; 
			
			if($.browser.msie){
				if($.browser.version == "7.0" || $.browser.version == "8.0"){
					$("#index-cont-one form .form-control").addClass("ie-form-control");
					$("#index-cont-one form .input-group-addon").addClass("ie-group-addon");
					$("#index-cont-one form .input-group-btn").addClass("ie-group-btn");
					$("#index-cont-one form .input-group-btn .btn").addClass("ie-btn");
					$("#index-cont-one .four-cont-two").addClass("ie-four-cont-two");
					$("#index-cont-one .four-cont-one").css("border-right","none");
					
					}	
				    // 此浏览器为 IE
				}
			else{
				$("#index-cont-one #more-job").css("clear","both");
				}
			
			var $banerli=$("#index-baner ul li").length;
			var  now=0;
			var timer=setInterval(next,3000);
			//导航条HOV
			$(function(){
				$("#school-menu-a,#school-menu").hover(function(){
					$("#school-menu").addClass("show-block")
				},function(){
					$("#school-menu").removeClass("show-block")
				})
				$("#social-menu-a,#social-menu").hover(function(){
					$("#social-menu").addClass("show-block")
				},function(){
					$("#social-menu").removeClass("show-block")
				})
				$("#contact-menu-a,#contact-menu").hover(function(){
					$("#contact-menu").addClass("show-block")
				},function(){
					$("#contact-menu").removeClass("show-block")
				})
			})	
			ChanPlay("#index-baner ul li","#index-baner ol li")
			function ChanPlay(obj,chrenobj){
				for(var i=0;i<$banerli;i++){
					$(chrenobj).removeClass("specrlie");
					$(obj).removeClass("show-block");
				}
				if($.browser.msie && ($.browser.version == "7.0") ){
						$(obj).css("display","none");
						$(obj).eq(now).css("display","block");
				    // 此浏览器为 IE
				} else{
						$(obj).eq(now).addClass("show-block");
				}
					$(chrenobj).eq(now).addClass("specrlie");
			}
			function next(){
				now++;
				if(now==$banerli){
					now=0;
				}
				ChanPlay("#index-baner ul li","#index-baner ol li");
			}
			$("#index-baner ol li").click(function(){
				now=$(this).index()-1;
				next();
			})
			$("#index-cont-two li").hover(function(){
				$liobjindex=$(this).index();
				$("#index-cont-two li").children().children(".down-ul-menu").css("display","none");
				$(".down-zindex").removeClass("down-zindex-hover");
				if($liobjindex!=2){
					$(this).children(".down-zindex").addClass("down-zindex-hover");
					$(this).children().children(".down-ul-menu").css("display","block");
				}
			},function(){
				$(".down-zindex").removeClass("down-zindex-hover");
				$("#index-cont-two li").children().children(".down-ul-menu").css("display","none");
			})
			
			$("#super-seach").hover(function(){
					$(this).addClass("super-seachhover");
				},function(){
					$(this).removeClass("super-seachhover");
				})
				
			$("#index-1-pora ul li").mouseover(function(){
				$("#index-1-pora ul li").children(".po-title").removeClass("show-none");
				$("#index-1-pora ul li").children(".po-pala-cont").addClass("show-none");
				$(this).children(".po-title").addClass("show-none");
				$(this).children(".po-pala-cont").removeClass("show-none");
			})
			$("#hire-menu-one li").mouseover(function(){
				var $objindex=$(this).index();
			})
			
			$("#commun-menu ul li").hover(function(){
				var objIndex=$(this).index();
				$("#commun-menu ul li").children(".center-sanjiao").removeClass("show-block");
				$(this).children(".center-sanjiao").addClass("show-block");
				$("#commun-cont-par").children(".commun-cont-one").removeClass("show-block");
				$("#commun-cont-par").children(".commun-cont-one").eq(objIndex).addClass("show-block")
			},function(){
				
			})
			
			
//新增加的
			return_bor();
        	$(window).bind("scroll", function(){
	    			return_bor();
				});
		function return_bor(){
					var ad=$(window).scrollTop();
					if(ad==0){
						$(".head-fix").removeClass("head-fix-border")
					}
					else{
						$(".head-fix").addClass("head-fix-border")
					}
				}
//新增加的
//6.23

var divHeight=$(".menu-arr-width").height()
var iframeBox=$(".iframe-box").height();
if(iframeBox<divHeight){
	var objheight=divHeight-$(".right-head").height()-$(".reserve-content-foot").innerHeight()-40;
	$(".content").css("height",objheight);
}		
//导航栏 LFH
var obj = $(".hov");
$("[class='float-left header-nav-menu'] li").click(function(){
    if(obj!=null)
        $(obj).removeClass("hov");
    $(this).addClass("hov")
    obj=$(this);
});
$("[class='float-left header-nav-menu'] li").hover(function(){
     $("[class='float-left header-nav-menu'] li").removeClass("hov");
},function(){
    $(obj).addClass("hov");
});		




})
