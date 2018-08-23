<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
     "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC  File Upload to Database Demo</title>
</head>
<body>


<div align="center">
        <h1>Spring MVC -Jdbc File Upload to Database Demo</h1>
        <form method="post" enctype="multipart/form-data"   action="aws"     commandName="name"     >
            <table border="0">
            
            <tr><td>Id Of The Category</td>
            <td><input  type="text"   name="id"/></td></tr>
            
            
            
             <tr><td>Name Of The Category</td>
            <td><input  type="text"   name="name"/></td></tr>
            
            
             <tr><td>Email Of The Category</td>
            <td><input  type="text"   name="email"/></td></tr>
            
            
            
             <tr><td>Name  Of The SubCategory</td>
            <td><input  type="text"   name="sub"/></td></tr>
            
           
                <tr>
                    <td>Image of The Category</td>
                    <td><input type="file" name="files" size="50" /></td>
                </tr>
                <tr>
                    <td>Video of The Category:</td>
                    <td><input type="file" name="files" size="50" /></td>
                </tr>
    
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Upload" /></td>
                </tr>  
            </table>
        </form>
        
        
        <h1>Get The Category Name&Image</h1>
     <form action="sankar"  method="get"   >
     <table   align="center">
     
     
     
     <tr><td>Category Name</td>
     <td><input  type="text"    name="name"/></td></tr>
     
     
     <tr><td>Submit  Form</td>
     <td><input  type="submit"  value="submit" /></td></tr>

     </table>
   
     </form>   
        
        
        
        
        
        
        
<form action="sankar123"    method="post"    enctype="multipart/form-data"   commandName="sankar" >


<h1>Category Details</h1>
<table  align="center" >






<tr><td>Category Id</td>
<td><input type="text"  name="id" /></td></tr>

<tr><td>Category Name</td>
<td><input type="text"  name="name" /></td></tr>


<tr><td>Category Email</td>
<td><input type="text"  name="email" /></td></tr>

<tr><td>Category Image</td>
<td><input type="file"  name="files" /></td></tr>


<tr><td>Category Video</td>
<td><input type="file"  name="files" /></td></tr>


<tr><td>Category Rate</td>
<td><input type="text"  name="rate" /></td></tr>

<tr><td>Submit</td>
<td><input type="submit"  /></td></tr>
</table>


</form>        
        
        
        
        <h1>Electrical And Electronics  SubCategory</h1>
        
        <form action=""       >
      <table     align="center">
      
      
      <tr><td>Electrical Category Id</td>
      <td><input  type="text"  name="id" /></td></tr>
      
     <tr><td>Electrical Category Name</td>
      <td><input  type="text"  name="name" /></td></tr>
       
      
      
      <tr><td>Electrical Category Email</td>
      <td><input  type="text"  name="email" /></td></tr>
       
      
     <tr><td>Electrical Category  Details</td>
      <td><input  type="text"  name="details" /></td></tr>
       
      <tr><td>Electrical Category Product Value</td>
      <td><input  type="text"  name="value" /></td></tr>
       
       
      <tr><td>Submit Button</td>
      <td><input  type="submit"  /></td></tr>


      </table>

        
        </form>
    
        <h1>Electronic Products By Category</h1>
     <form action="electronicsubcat">
   
<input    type="text"  name="name"  />
     <input   type="submit"          ></form>   
        
<h1>Electronic Products By Id</h1>

<form action="electronicsubcat1">
 
<input    type="text"  name="id"  />
     <input   type="submit"          ></form> 







<h1>Education Category</h1>

<form action="education"     >

<input  type="text"  name="name" />
<input    type="submit"    value="submit"  >


</form>




<h1>HandMade Category</h1>

<form action="handmade"     >

<input  type="text"  name="name" />
<input    type="submit"    value="submit"  >


</form>


<h1>Bank Category</h1>

<form action="bank"     >

<input  type="text"  name="name" />
<input    type="submit"    value="submit"  >


</form>


<h1>Hospital Category</h1>

<form action="hospital"     >

<input  type="text"  name="name" />
<input    type="submit"    value="submit"  >


</form>

<h1>Hospital Products By Id</h1>

<form action="hospitalid">
 
<input    type="text"  name="id"  />
     <input   type="submit"          ></form> 


<h1> Manufacture Category</h1>

<form action="manufacture"     >

<input  type="text"  name="name" />
<input    type="submit"    value="submit"  >


</form>

<h1>Login Form</h1>
<form action="sankar">
<input  type="text"  name="name"  >

<input   type="submit"   >



</form>




<form action="loginform"  commandName="login"  method="post">
<table  align="center">
<tr><td>UserName</td>
<td><input type="text"  name="username" /></td></tr>

<tr><td>Password</td>
<td><input    type="password"    name="Password"/></td></tr>

<tr><td>Eranchise</td>
<td><input    type="text"    name="designation"/></td></tr>

<tr><td>Submit</td>
<td><input    type="submit"    /></td></tr>

</table>


</form>

<h1>Form Data For DealCount</h1>
<form action="dealcollection">
<input type="text"   name="name" />

<input   type="submit"  >

</form>

<h1>Referal Code</h1>
<form action="referal">

<input type="text"   name="name"/>
<input   type="submit">

</form>



<h1>Referal NC</h1>
<form action="ReferalNC">

<input type="text"   name="name"/>
<input   type="submit">

</form>



<h1>Employee Full Data</h1>
<form action="http://ec2-13-126-39-134.ap-south-1.compute.amazonaws.com:8080/NanoCartProject/employee">

<input type="text"   name="name"/>

<h1>Starting Date</h1>
<input type="text"  name="stdate"/>
<h1>Ending Date</h1>
<input  type="text"  name="Edate" />
Submit
<input   type="submit">

</form>



<h1>Vendor Register Table Data</h1>
<form action="vendorRegister"   method="post">

Email
<input type="text"   name="email"  /><br/>

Submit
<input type="submit"   />

</form>


<h1>Testing Employees</h1>
<form action="test">

<input  type="text"  name="email"/>
<input  type="submit"    >






</form>




<h1>Employeee DataBy Email,Stating date,Ending Date</h1>
<form action="employee"   method="post">

<table  align="center">
<tr><td>Email of the Empployee</td>
<td><input type="text"   name="name"  /></td></tr>

<tr><td>Starting Date of the Empployee</td>
<td><input type="text"   name="stdate"  /></td></tr>

<tr><td>Ending Date of the Empployee</td>
<td><input type="text"   name="Edate"  /></td></tr>


<tr><td>Submit Empployee</td>
<td><input type="submit"     /></td></tr>

</table>


</form>


<h1>Employee Data Testing</h1>
<form action="employeedata">
Employee Email
<input type="text"   name="ememail"  />


<input    type="submit">

</form>



<h1>Employee Data Is Updating </h1>

<form action="emplocyeeupdate"   method="post"    commandName="employee" >

Name Of The Employee
<input  type="text"  name="eName"  /><br/>

email Of The Employee
<input  type="text"  name="eEmail"  /><br/>


Password Of The Employee
<input  type="text"  name="ePassword"  /><br/>


eMobile  of The Employee
<input  type="text"   name="eMobile" /><br/>

eAddress  of The Employee
<input  type="text"   name="eAddress" /><br/>

ReferalCode  of The Employee
<input  type="text"   name="ReferalCode" /><br/>

eImage  of The Employee
<input  type="text"   name="eImage" /><br/>


eStatus  of The Employee
<input  type="text"   name="eStatus" /><br/>

Submit
<input  type="submit"    /><br/>

</form>



<h1>Delete The Employee By Email</h1>
<form action="deleteemployee">
<input type="text"  name="email" />
<input   type="submit">
</form>


<h1>UnderSupervisor Data</h1>
<form action="undersupervisor">

<input   type="text"  name="supemail" />

<input     type="submit">
</form>


<h1>Supervisor Update </h1>
<form action="supervisordata">

<input   type="text"   name="supemail"/>
<input  type="submit"  >

</form>


<h1>Update Supervisor</h1>
<form action="supervisorupdate"  method="post" commandName="superupda"  >

Name<input   type="text"   name="supervisorid" />
Email<input  type="text"   name="supervisorName" />
supervisorPassword<input  type="text"  name="supervisorPassword" />
supervisorPinNumber<input  type="text"  name="supervisorPinNumber"/>
supervisor3DigitCode<input     type="text"   name="supervisor3DigitCode"/>
supervisorNumber<input   type="text"  name="supervisorNumber"/>
supervisorBankAccount<input    type="text"   name="supervisorBankAccount"/>
supervisorField<input    type="text"   name="supervisorField"/>
supervisorDateOfIssue<input   type="text"   name="supervisorDateOfIssue"/>
supervisorNonRefundbleDeposite<input   type="text"   name="supervisorNonRefundbleDeposite"/>
supervisorTemparary_Perminent<input    type="text"   name="supervisorTemparary_Perminent"/>
supervisorAaDharCardNumber<input   type="text"   name="supervisorAaDharCardNumber"/>

Submit Button<input   type="submit">
</form>


<h1>Franchise Data </h1>
<form action="franchise">
<input    type="text"  name="email"/>
<input   type="submit">

</form>

<h1>UndersubCategory</h1>
<form action="underfranchise">

<input    type="text"  name="email">

<input   type="submit">
</form>





    </div>

</body>
</html>