<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="updatefranchise"  method="post"  commandName="update">
<table   align="center">
<tr><td>idFranchise;</td>
<td><input  type="text"  name="idFranchise"/></td></tr>


<tr><td>FranchiseName;;</td>
<td><input  type="text"  name="FranchiseName"/></td></tr>



<tr><td>FranchiseEmail;</td>
<td><input  type="text"  name="FranchiseEmail"/></td></tr>


<tr><td>FranchisePassword;</td>
<td><input  type="text"  name="FranchisePassword"/></td></tr>



<tr><td>FranchiseDateOfIssue;</td>
<td><input  type="text"  name="FranchiseDateOfIssue"/></td></tr>


<tr><td>FranchisePinNumber;</td>
<td><input  type="text"  name="FranchisePinNumber"/></td></tr>


<tr><td>FranchiseNonRefundbleDeposite;</td>
<td><input  type="text"  name="FranchiseNonRefundbleDeposite"/></td></tr>



<tr><td>FranchiseNonRefundbleDeposite;</td>
<td><input  type="text"  name="FranchiseNonRefundbleDeposite"/></td></tr>



<tr><td>Franchise3DigitCode;;</td>
<td><input  type="text"  name="Franchise3DigitCode"/></td></tr>



<tr><td>FranchiseTemparary_Perminent;</td>
<td><input  type="text"  name="FranchiseTemparary_Perminent"/></td></tr>



<tr><td>FranchiseNumber</td>
<td><input  type="text"  name="FranchiseNumber"/></td></tr>


<tr><td>FranchiseAaDharCardNumber</td>
<td><input  type="text"  name="FranchiseAaDharCardNumber"/></td></tr>


<tr><td>FranchiseBankAccount</td>
<td><input  type="text"  name="FranchiseBankAccount"/></td></tr>


<tr><td>FranchiseField</td>
<td><input  type="text"  name="FranchiseField"/></td></tr>




<tr><td>Submit</td>
<td><input  type="submit"  /></td></tr>

</table>

</form>



<h1>Delete The Franchise</h1>
<form action="deletefranchise">

<input type="text"  name="email"  />

<input  type="submit">

</form>








</body>
</html>