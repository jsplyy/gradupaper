<?php 

    if(isset($_POST['username']) && $_POST['username']!='')
    {
        $username = $_POST[username];
        
        //Include Database Handle
        require_once 'include/DB_functions.php';
        $db = new DB_functions();
        
        $response = array("username" => $username, "sucess" => 0, "error" => 1);
        
        
        $passwd = $_POST['passwd'];
        
        $user = $d->getUserByUsernameAndPasswd($username,$passwd);
        if($user != FALSE)
        {
            $response["sucess"] = 1;
            echo json_decode($response);
        }
        else
        {
            $response["error"] = 1;
            ehco json_decode($response);
            
        }
        
        
    }

?>