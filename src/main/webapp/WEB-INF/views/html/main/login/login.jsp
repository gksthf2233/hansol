<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="resources/css/Login-Form-Clean.css">

<div class="modal login-clean fade" id="loginModal" tabindex="-1"
	role="dialog" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-body">
				<form>
					<h2 class="sr-only">Login Form</h2>
					<div class="illustration"></div>
					<div class="form-group">
						<input class="form-control" type="text" id="user_id" name="user_id"
							placeholder="ID">
					</div>
					<div class="form-group">
						<input class="form-control" type="password" id="user_pw" name="user_pw"
							placeholder="Password">
					</div>
					<div class="form-group">
						<button class="btn btn-primary btn-block" id="login" type="button">LogIn</button>
						<button class="btn btn-primary btn-block" type="submit">KaKaoTalk
							LogIn</button>
					</div>
					<a class="forgot" role="button" data-toggle="modal"
						data-dismiss="modal" data-target="#registModal">Or Regist</a>
				</form>
				<script src="resources/js/jquery.min.js"></script>
    			<script src="resources/bootstrap/js/bootstrap.min.js"></script>
				<script type="text/javascript">
					$("#login").click(function() {
						var loginData = {
							user_id : $("#user_id").val(),
							user_pw : $("#user_pw").val()
						};
						console.log(loginData);
						login(loginData);
					});
				
					function login(loginData) {
						$.ajax({
							url : "/semi/login/loginUser",
							type : "POST",
							contentType : "application/json;charset=UTF-8",
							data : JSON.stringify(loginData),
							dataType : "json",
							success : function(data) {
								alert("로그인 성공");
							},
							error : function(data) {
								alert("로그인 실패");
							}
						});
					}
				</script>

			</div>
			<!-- /modal-body -->
		</div>
		<!-- /modal-content -->
	</div>
	<!-- /modal-dialog -->
</div>
<!-- /modal -->


