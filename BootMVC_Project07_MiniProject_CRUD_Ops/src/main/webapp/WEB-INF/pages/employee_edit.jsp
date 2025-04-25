<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="text-align:center; color:red">Edit Employee</h1>

<form:form modelAttribute="emp" method="post" >
    <table border="1" bgcolor="cyan" align="center">
    
    	<tr>
            <td>Employee No :: </td>
            <td><form:input path="empNo" readonly="true" /></td>
        </tr>
    	
    
        <tr>
            <td>Employee Name :: </td>
            <td><form:input path="ename" /></td>
        </tr>

        <tr>
            <td>Employee Designation :: </td>
            <td><form:input path="job" /></td>
        </tr>

        <tr>
            <td>Employee Salary :: </td>
            <td><form:input path="sal" /></td>
        </tr>

        <tr>
            <td colspan="2" style="text-align:center">
                <input type="submit" value="Edit Employee" />
            </td>
        </tr>
    </table>
</form:form>
