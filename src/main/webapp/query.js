
$(document).ready(function(){
	
    $("#submit").click(function(){
		var validation = !!chkblank('fname','n-error') && !!chkblank('lname','n-error') && !!ValidateER('email','e-error') && !!chkblank('password','p-error') && !!chkpw('cpassword','cp-error');
		
		if (validation == true) {
        	$("#form").submit();
		}else{
			return false
		}
    });
});
