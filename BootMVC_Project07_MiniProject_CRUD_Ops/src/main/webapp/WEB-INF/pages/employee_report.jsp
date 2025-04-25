<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<h1 style="text-align:center ; color:red"> Employees Report </h1>

<c:choose>
	<c:when test="${!empty empData}"> 
	
		<table border="1" align="center" bgcolor="cyan"> 
				<tr>
					<th>EMPNO</th>
					<th>EMPNAME</th> 
					<th>JOB</th>  
					<th>Salary</th>
					<th>Operations</th>
				</tr>
				
				<c:forEach var="emp" items="${empData}">
					<tr> 
						<td> ${emp.empNo} </td>
						<td> ${emp.ename} </td>
						<td> ${emp.job} </td>
						<td> ${emp.sal} </td>
						<td> 
							 <a href="edit?no=${emp.empNo}"> <img src="images/edit1.jpeg" width="50" height="50">   </a> &nbsp;&nbsp;
							 <a onclick="return confirm('Do you want to delete the record?')"  href="delete?no=${emp.empNo}"> <img src="images/delete1.png" width="50" height="50"> </a> 
						</td>
					</tr>
				</c:forEach>
				
		</table>
	
	</c:when>
	
	<c:otherwise>
		<h1 style="text-align:center ; color:red">Records Not found</h1>
	</c:otherwise>

</c:choose>

<c:if test="${!empty resultMsg}"> 
	<h3 style="color:green ; text-align:center"> ${resultMsg} </h3>
 </c:if>

<hr>
<h1 style="text-align:center ; color:red"> <a href="./"> <img src="images/home.png" width="50" height="50">Home </a> </h1>
<br><br>
<hr>
<h1 style="text-align:center"> <a href="add"> <img alt="No image found" src="images/add1.jpeg"> <br> Add Employee  </a> </h1>

