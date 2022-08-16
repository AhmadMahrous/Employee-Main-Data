<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><!DOCTYPE html>
<html>
   <head>
   	   <title>Search for Employee</title>
   		 
         
       <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/search-employee-style.css">
       <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
       <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
       <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
      
   </head>
   <body>
   
   	<div class="container">
      <div id ="formStyle">
         <h3>Search Employee</h3>
         <form:form action="showResult" modelAttribute="employee" method="POST" id="form" >
         
            Enter Employee Code:
            <form:input  path="employeeCode" />
            <br>
             Enter Employee ID:
            <form:input path="id" />
            <br>
            Enter Employee First Name:
            <form:input path="firstName"/>
            
            <br>
            Enter Employee Last Name:
            <form:input path="lastName"/>
            <br>
            Enter Employee Birth Date:
           
            <form:input path="birthDate" />
            
            <br>
            Enter Employee Birth City:
            <form:select path="birthCity">
                <form:option value="" /> 
				<form:option value="Cairo" />
				<form:option value="Alex" />
				<form:option value="Giza" />
				<form:option value="Sohag" />
			
			</form:select>
			
            <br>
            Enter Employee Department:
            <form:select path="employeeDepartment">
            	<form:option value="" /> 
				<form:option value="Software" />
				<form:option value="Human Resource" />
				<form:option value="Financial" />
				<form:option value="Marketing" />
			</form:select> 
			
            <br>
            Enter Employee Job Title:
            <form:input path="jobTitle"/>
            
            <br>
            Enter Employee Status:
            <form:select path="employeeStatus">
				<form:option value="" /> 
				<form:option value="Active" />
				<form:option value="InActive" />
			</form:select>
			
            <br>
            Enter Employee Contract Type:
            <form:select path="contractType">
				<form:option value="" /> 
				<form:option value="Full-time" />
				<form:option value="Part-time" />
				<form:option value="Remotely" />
				<form:option value="Freelance" />
			</form:select>
			
            <br><br>
            
            <input type="submit" value="Search" />
            <input type="reset" value="Reset"/>
         </form:form>
         
        </div>
         <div>
            <table style="width: 80%" id="employee">
               <thead>
                  <tr>
                     <th>ID</th>
                     <th>Employee Code</th>
                     <th>Employee Name</th>
                     <th>Birth Date</th>
                     <th>Birth City</th>
                     <th>Department</th>
                     <th>Job Title</th>
                     <th>Status</th>
                     <th>Contract Type</th>
                  </tr>
               </thead>
               <tbody>
               	
                  <c:forEach var="tempEmployee" items="${employees}">
                     <tr>
                        <td>${tempEmployee.id}</td>
                        </span>
                        <td>${tempEmployee.employeeCode}</td>
                        </span>
                        <td>${tempEmployee.firstName} ${tempEmployee.lastName}</td>
                        </span>
                        <td>${tempEmployee.birthDate}</td>
                        </span>
                        <td>${tempEmployee.birthCity}</td>
                        </span>
                        <td>${tempEmployee.employeeDepartment}</td>
                        </span>
                        <td>${tempEmployee.jobTitle}</td>
                        </span>
                        <td>${tempEmployee.employeeStatus}</td>
                        </span>
                        <td>${tempEmployee.contractType}</td>
                     </tr>
                  </c:forEach>
               </tbody>
            </table>
         </div><br>
         
         <p>
					<a href="${pageContext.request.contextPath}/employee/employeesList"> Back To List </a>
		</p>
        </div>
   		 <script>
   		function myFunction() {
   		  document.getElementById("form").reset();
   		}
          
       </script>
        
   </body>
</html>