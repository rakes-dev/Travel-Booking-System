<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="oracle.jdbc.OracleResultSetMetaData"%>
<%@page import="oracle.jdbc.OracleResultSet"%>
<%@page import="oracle.jdbc.OraclePreparedStatement"%>
<%@page import="oracle.jdbc.OracleConnection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All User Details</title>
      
        <link rel="stylesheet" href="../css/media.css">
        <style>
    table {
        border-collapse: collapse;
        width: 60%;
        margin: auto; /* This will center the table */
    }

    th, td {
        padding: 10px;
        text-align: left;
    }

    th {
        background-color: #333;
        color: white;
    }

    td {
        background-color: #f4f4f4;
    }

    body {
        background-image: url('../images/admin.jpg');
        font-family: 'Nunito', sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
    }

    header {
        background-color: #333;
        color: white;
        text-align: center;
        padding: .5rem;
        margin-bottom: 4rem;
    }
    h1{
        font-size: 3rem;
    }
</style>


    </head>
    
    <header>
        <h1>MANAGE PACKAGES</h1>
    </header>
    
    <%! 
//STEP 3: DECLARING ORACLE OBJECTS AND OTHE
      OracleConnection oconn;
      OraclePreparedStatement ops;
      OracleResultSet ors;
      OracleResultSetMetaData orsmd;
      int reccounter,colcounter,counter;
    %>
    
    <!--Step 4: REGISTERING ORACLE DRIVER-->
    <%
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
      //STEP 5: INSTANTIATING THE CONNECTION
        oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@rakesh:1521:orcl","RAKES", "TRAVEL");
     //11 STEP 6: INSTANTING THE STATEMENT
        ops = (OraclePreparedStatement)oconn.prepareCall("select * from PACKAGES");
     //STEP 7: EXECUTING THE QUERY
        ors = (OracleResultSet)ops.executeQuery();
     // STEP 8: GETTING THE COLUMN INFORMATION
        orsmd = (OracleResultSetMetaData)ors.getMetaData();

%>

<body>
<center>
        <table>
            <thead>
                <tr>
                    <%
                      for(counter=1;counter<=orsmd.getColumnCount();counter++)
                      {
                    %>
                    <th style="background-color: #ffa500;color: white;"><%=orsmd.getColumnName(counter)%></th>
                    <%
                        }
                    %>
                    <th style="background-color: #ffa500;color: white;">ACTION</th>
                </tr>
            </thead>
            <tbody>
                <%
                  while(ors.next() == true)  
                  {
                %>
                <tr>
                    <%
                      for(counter=1;counter<=orsmd.getColumnCount();counter++)
                      {
%>
                    <th><%=ors.getString(counter)%></th>
                    <%
                      } 
                    %>
                    <td style="background-color: #333;color: white;">
                        <button>Edit</button><button>Delete</button>
                    </td>
                </tr> 
                <%
                  }    
                %>
            </tbody>
            <tfoot>
                <tr>
                    <th colspan="10" style="background-color: orange;"><center><span style="background-color: black; padding: 7px"><span style="color: orange;">T</span>ravel</span></center></th>
                </tr>style="color:orange;"
            </tfoot>
        </table>
            </center>
    </body>
</html>
