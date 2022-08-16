<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
   <head>
      <title>List Of Employees</title>
      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/list-employee-style.css">
      <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
      <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
      <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
   </head>
   
   <body>
      <h2>Welcome to Employee Main Data</h2>
      <div>
         <input type="button" value="Add Employee"
            onclick="window.location.href='showEmployeeForm'; return false;" />
         <input type="button" value="Search Employee"
            onclick="window.location.href='searchForm'; return false;" />
            
         <button  id="click" onclick="showOrHideDiv()">Show Employees</button>
      </div>
      
      <br>
      <br>
      
      <div id="view" style="display: none;">
         <table style="width: 100%" id="employee">
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
                     <td>${tempEmployee.firstName } ${tempEmployee.lastName}</td>
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
      </div>
     
     
      <script>
         function showOrHideDiv() {
            var v = document.getElementById("view");
            if (v.style.display === "none") {
               v.style.display = "block";
            } else {
               v.style.display = "none";
            }
         }
          
      </script>
   </body>
</html>