<!doctype html>


<html>
<head>
<meta charset="utf-8">
<title>Home</title>
	
	        <link href="header.css" rel="stylesheet" type="text/css">
			<link href="index.css" rel="stylesheet" type="text/css">
			<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>

<body class="w3-content" style="max-width:100%">


	<div class="header"><?php include('./header.html');?></div>
	<link href="header.css" rel="stylesheet" type="text/css">
	<h2>Display All Accounts</h2>


<?php

	$servername = "proj-mysql.uopnet.plymouth.ac.uk";
	$database = "ISAD251_JScammell";
	$username = "ISAD251_JScammell";
	$password = "ISAD251_22212869";



	//  Check permissions of the person logged on is allowed to use the Account screen.		
	//  Only permissions = Admin is allowed.												
	//  Read the "LoggedOn" table to check user and permissions.							

    $conn = mysqli_connect($servername, $username, $password, $database);
	if (!$conn) {
		die("connection failed: " . mysqli_connect_error());
	}
	
	// 
	//  Read the "LoggedOn" table to check user and permissions.
	//
	$sql="SELECT permissions FROM loggedon WHERE permissions = 'admin'";
	$result = $conn->query($sql);
	$obj = mysqli_fetch_object($result);
	$numrows = mysqli_num_rows($result);
	if (($numrows == 0) or ($obj->permissions != 'admin'))  {
		echo "You do not have permissions to use this screen. ";
		echo "<br>";
		echo "Please login with a differnt user account ";
		echo "<br>";

		//		mysqli_free_result($result);
		mysqli_close($conn);

	//
	// Else user has persissions to use this screen
	} else {



		if ($_POST['btnShow'])  {	
		//
		//	Display all records saved in the Account table when button-show pressed
		//
		//	{
			$conn = mysqli_connect($servername, $username, $password, $database);
			if (!$conn) {
				die("connection failed: " . mysqli_connect_error());
			}

			$sql="SELECT accountId, permissions, name, telephone, email, accountPwd FROM account  WHERE accountId>0";
			$result = $conn->query($sql);
	//		$obj = mysqli_fetch_object($result);

	//		if ($result -> $obj->accountId > 0)  {
								
				echo "<br>";
				echo " ID ... Permissions. Name...... .. email.... ... Password";
				echo "<br>";
				while ($obj=mysqli_fetch_object($result))
					{
					printf ("%s ",$obj->accountId);
					echo " ...    ";
					printf ("%s ",$obj->permissions);
					echo "  ...   ";
					printf ("%s ",$obj->name);
					echo "........     ";
					printf ("%s ",$obj->telephone);
					echo "  ..... .......  ";
					printf ("%s ",$obj->email);
					echo "   .......  ";
					printf ("%s \n",$obj->accountPwd);
					echo "<br>";
				
				} //end while
	
				mysqli_free_result($result);

	//		}  //endif

			mysqli_close($conn);


		} // end if
	} // end elseif

		echo "<br>";
		echo '<form><input type="button" value="Return to previous page" onClick="javascript:history.go(-1)"></form>';

?>

</body>

</html>