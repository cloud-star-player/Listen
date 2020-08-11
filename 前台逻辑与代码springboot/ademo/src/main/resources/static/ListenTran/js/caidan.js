//导航菜单栏移动

$(window).load(function() {
	var onOff =1;
	$('#menu').click(function(){
		   // 自定义开关 (onOff)
		if(onOff==1){
		$('.right').animate({right:'-=17.625rem'},"slow");
		$('.left').animate({left:'+=17.625rem'},"slow");
		$('.footer').css("visibility"," hidden");
		$('.footer').animate({right:'+=17.625rem'},"slow");
		onOff=0;
		}
		else{
		$('.right').animate({right:'+=17.625rem'},"slow");
		$('.left').animate({left:'-=17.625rem'},"slow");
		setTimeout(function(){
		$('.footer').css("visibility","visible")
		},
		600
		);
		$('.footer').animate({right:'-=17.625rem'},"slow");
		onOff=1;	
		}
	});
	//菜单栏按钮的开启
	$('.toggle').click(function(e){
	  e.preventDefault(); // The flicker is a codepen thing
	  $(this).toggleClass('toggle-on');
	});	
});	
$(window).resize(function() {	
	$('.left').css('height', $(window).height());
	$('.left').css('left', '-17.625rem');
	var onOff =1;
	$('#menu').click(function(){
		   // 自定义开关 (onOff)
		if(onOff==1){
		$('.right').animate({right:'-=17.625rem'},"slow");
		$('.left').animate({left:'+=17.625rem'},"slow");
		$('.footer').css("visibility"," hidden");
		$('.footer').animate({right:'+=17.625rem'},"slow");
		onOff=0;
		}
		else{
		$('.right').animate({right:'+=17.625rem'},"slow");
		$('.left').animate({left:'-=17.625rem'},"slow");
		setTimeout(function(){
		$('.footer').css("visibility","visible")
		},
		600
		);
		$('.footer').animate({right:'-=17.625rem'},"slow");
		onOff=1;	
		}
	});
	//菜单栏按钮的开启
	$('.toggle').click(function(e){
	  e.preventDefault(); // The flicker is a codepen thing
	  $(this).toggleClass('toggle-on');
	});	
});	