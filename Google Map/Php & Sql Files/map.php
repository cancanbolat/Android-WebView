<?php 

// connection ->
$server = "localhost";
$user   = "xxxxxxxxxxx";
$pass   = "xxxxxxxxxxx";
$table  = "cancanbo_web_view";

$con = mysqli_connect($server,$user,$pass,$table);

mysqli_set_charset($con,"utf8");

// json and select query ->
$query = mysqli_query($con, "SELECT * FROM google_map");
$row   = mysqli_fetch_assoc($query);

class Result{
    public $title;
    public $lat;
    public $lot;
}

$po = new Result();

$po->title = $row["title"];
$po->lat   = $row["lat"];
$po->lot   = $row["lot"];

$json = json_encode($po,JSON_UNESCAPED_UNICODE);

echo $json;


