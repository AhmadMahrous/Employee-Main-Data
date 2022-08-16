<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>

<html>
	<head>
		<title>Adding New Employee</title>
		<link type="text/css"
			  rel="stylesheet" 
			  href="${pageContext.request.contextPath}/resources/css/add-employee-style.css">
	</head>

	<body>
		
		<div class="container">
		
			
			
			<div id ="formStyle">
			
				<h3>Add New Employee</h3>
				<form:form action="addEmployee" modelAttribute="employee" method="POST">
					
					
					Enter Employee First Name:		<form:input path="firstName" placeholder="first name"/>
													<form:errors path="firstName" />
					<br><br>
					Enter Employee Last Name:		<form:input path="lastName" placeholder="last name"/>
													<form:errors path="lastName" />
					<br><br>						
					Enter Employee Birth Date:		<form:input  path="birthDate" placeholder="yyyy-mm-dd"/> 
											 	    <form:errors path="birthDate" />
					<br><br>						  
					Enter Employee Birth City:		<form:select path="birthCity">
														<form:option value="Cairo" />
														<form:option value="Alex" />
														<form:option value="Giza" />
														<form:option value="Sohag" />
			
											  		</form:select>
												    <form:errors path="birthCity" />
					<br><br>					  
					Enter Employee Department:		<form:select path="employeeDepartment">
														<form:option value="Software" />
														<form:option value="Human Resource" />
														<form:option value="Financial" />
														<form:option value="Marketing" />
			
											  		</form:select> 
											  		<form:errors path="employeeDepartment" />
					<br><br>						  
					Enter Employee Job Title:		<form:input path="jobTitle" placeholder="job title"/>
											 		<form:errors path="jobTitle" />
					<br><br>
					Enter Employee Status:			<form:select path="employeeStatus">
														<form:option value="Active" />
														<form:option value="InActive" />
														
			
											  		</form:select>  
										  			<form:errors path="employeeStatus" />
					<br><br>	
					Enter Employee Contract Type:	<form:select path="contractType">
														<form:option value="Full-time" />
														<form:option value="Part-time" />
														<form:option value="Remotely" />
														<form:option value="Freelance" />
			
											  		</form:select>  
											     	<form:errors path="contractType" />
					
					<br><br>
					<input type="submit" value="Save"/>
								
					 
				
				</form:form>
				
				<div style="clear; both;"></div>
				
				<p>
					<a href="${pageContext.request.contextPath}/employee/employeesList"> Back To List </a>
				</p>
			
			</div>
		</div>
		
	
	</body>

</html>