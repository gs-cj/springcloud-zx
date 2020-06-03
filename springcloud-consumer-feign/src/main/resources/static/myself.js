        $(function(){
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
				        	function big_mengban(){
        		var conthei=$("#form-box").height()+$(".sec-head").outerHeight()+20;
        		
        		if($("#form-box").height()>=800){
        			$("#big-mengban").css("height",$("#form-box").height());
        			$("#index-4-insert").css("height",conthei);
        		}
        		else{
        			$("#big-mengban").css("height","800px");
        		}
        		
        	}
        	
        	var documentb=$(window).height();
        	$("#imge-box").css("height",documentb+80);
        	$("#cont-box").css("height",documentb+80);
        	var Menuindex;
        	var arr_down=new Array();
        	$("#myself-menu li").click(function(){
        		Menuindex=$(this).index();
        		blue_img(this,75,Menuindex);
        	})
			$("#myself-menu li").hover(function(){
				var objindex=$(this).index();
				daohang_img("#myself-menu li",68)
				blue_img("#myself-menu li",75,objindex);
			},function(){
				daohang_img("#myself-menu li",68);
				blue_img("#myself-menu li",75,Menuindex);
			})
			daohang_img("#myself-menu li",68)
			function daohang_img(obj,objlenth){
				var objheight=$(obj).length;
				for(var i=0;i<objheight;i++){
					 
					var imgindex=Number(objlenth) + Number(i);
					var  url_img="url(../NewImages/ZTE_"+imgindex+"_2015050000.png)";
					$(obj).eq(i).children().css("color","#FFFFFF").children(".img-menu").css("background-image",url_img)
				}
			}
			function blue_img(obj,objlenth,objindex){
				var imgindex=Number(objlenth) + Number(objindex);
				var  url_img="url(../NewImages/ZTE_"+imgindex+"_2015050000.png)";
				$(obj).eq(objindex).children().css("color","#004EA2").children(".img-menu").css("background-image",url_img)
			}
			var objarray=new Array();
				objarray=arr_push(".right-cent-title .down-index");
			$(".right-cent-title").click(function(){
				var objindex=$(this).index();
				if(objarray[objindex]==true){
					$(".right-cent-title").children(".down-index").html("<span class='icon-chevron-down'></span>");
					$(".right-cent-title").parent().children(".cnet-table").addClass("cent-none")
					$(this).children(".down-index").html("");
					$(this).children(".down-index").html("<span class='icon-chevron-up'></span>");
					$(this).next(".cnet-table").removeClass("cent-none")
					objarray[objindex]=false;
				}
				else if(objarray[objindex]==false){
					for(var i=0;i<objarray.length;i++){
						objarray[i]=true;
					}
					$(this).children(".down-index").html("");
					$(this).children(".down-index").html("<span class='icon-chevron-down'></span>")
					objarray[objindex]=true;
					$(this).next(".cnet-table").addClass("cent-none");
				}
					
				
			})
			function arr_push(obj){
				var objarray=new Array();
				objarray.push(false);
				for(var i=1;i<$(obj).length;i++){
					objarray.push(true);
				}
				return objarray;
			}
			table_bg()
			function table_bg(){
				$("#seach-table .table tr:odd td").addClass("odd"); 
				$("#seach-table .table tr:even td").addClass("even"); 
			}
			var open_true=false;
			$("#zhedie").click(function(){

        			if(open_true==true){
        				$(".zhedie-menu").addClass("show-block");
	        			$(this).html("");
	        			$(this).html("折叠");
	        			open_true=false;
	        			
        			}
        			else if(open_true==false){
        				$(".zhedie-menu").removeClass("show-block");
	        			$(this).html("");
	        			$(this).html("展开");
	        			open_true=true;
        			}
        			big_mengban()
        		})
			big_mengban()
        	function big_mengban(){
        		var conthei=$("#form-box").height()+$(".sec-head").outerHeight()+20;
        		
        		if($("#form-box").height()>=800){
        			$("#big-mengban").css("height",$("#form-box").height());
        			$("#index-4-insert").css("height",conthei);
        		}
        		else{
        			$("#big-mengban").css("height","800px");
        			$(".spec-xiugai").css("height","1020px");
        		}
        		
        	}
        	
        	$("#change-ul li").click(function(){
        		$("#change-ul li").removeClass("active")
        		$(this).addClass("active");
        		var objindex=$(this).index();
        		
        		if(objindex==0){
        			$("#tab1").removeClass("show-none")
        			$("#tab2").addClass("show-none")
        		}
        		else{
        			$("#tab2").removeClass("show-none")
        			$("#tab1").addClass("show-none")
        			var arr=arr_push(".zhedie");
        			$(".zhedie").click(function(){
        				var objchrenindex=$(this).parent().parent().index();
        				var $obj=$(this).parent().parent().next();
	        			if(arr[objchrenindex]==true){
	        				$(this).parent().next().removeClass("cent-none");
		        			arr[objchrenindex]=false;
		        			
	        			}
	        			else if(arr[objchrenindex]==false){
	        				$(this).parent().next().addClass("cent-none");
		        			arr[objchrenindex]=true;
	        			}
	        			for(var i=0;i<arr.length;i++){
	        					if(arr[i]==true){
	        						$(".zhedie").eq(i).html("");
	        						$(".zhedie").eq(i).html("展开");
	        					}
	        					else if(arr[i]==false){
	        						$(".zhedie").eq(i).html("");
	        						$(".zhedie").eq(i).html("折叠");
	        					}
							}
	        			big_mengban()
	        		})
        		}
        		big_mengban()
        	})
        })	
        
