import { Button, Container, Paper } from '@mui/material';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import * as React from 'react';
import { useEffect, useState } from 'react';


export default function Dog() {
    const paperStyle = {padding:'50px 20px', maxWidth:"100%", margin:"20px auto"}
    const [age,setAge]=useState('')
    const [name,setName]=useState('')
    const [address,setAddress]=useState('')
    const [type,setType]=useState('')
    const [dogs,setDogs]=useState([])
   

    const handleClick=(e)=>{
        e.preventDefault()
        const Dog={age,name,address,type}
        console.log(Dog)
        fetch("http://localhost:8080/dog/add",{
            method:"POST",
            headers:{"Content-Type":"application/json"},
            // This stringify method changes JS object to JSON strings.
            body:JSON.stringify(Dog)
        }).then(()=>{
            console.log("New dog added");
        })
    }
useEffect(()=>{
    fetch("http://localhost:8080/dog/getAll")
    .then(res=>res.json())
    .then((result)=>{
        setDogs(result);
    }
)
},[])
  return (
    <Container maxWidth="lg">
        <Paper elevation={3} style={paperStyle}> 
            <h1 style = {{color:"blue", textAlign:"center"}}><u>Add Dog</u></h1>
    <Box
      component="form"
      sx={{ display: "flex", flexWrap: "wrap", gap: 2, justifyContent: "center" }}
      noValidate
      autoComplete="off"
      >
      <TextField id="outlined-basic" label="Dog Age" variant="outlined" fullWidth 
      value = {age}
      onChange={(e)=>setAge(e.target.value)}/>
      <TextField id="outlined-basic" label="Dog Name" variant="outlined" fullWidth 
      value = {name}
      onChange={(e)=>setName(e.target.value)}/>
      
      <TextField id="outlined-basic" label="Dog Address" variant="outlined" fullWidth 
      value = {address}
      onChange={(e)=>setAddress(e.target.value)}/>
      <TextField id="outlined-basic" label="Dog Type" variant="outlined" fullWidth 
      value = {type}
      onChange={(e)=>setType(e.target.value)}/>

      <Button variant="contained" color="secondary" onClick={handleClick}>Forward</Button>

    </Box>
    {/* Displaying text with spaces */}
    {/* <p>{[age, name, address, type].join(" ")}</p> */}
        </Paper>
        <h1>Dogs</h1>
        <Paper elevation={3} style={paperStyle}> 
            {dogs.map((dog)=>(
                <Paper elevation={6} style={{margin:"10px",padding:"15px",textAlign:"left"}} key={dog.id}>
                 Id:{dog.id}<br/>
                 Age:{dog.age}<br/>
                 Name:{dog.name}<br/>
                 Address:{dog.address}<br/>
                 Type:{dog.type}
                </Paper>
            ))}

    </Paper>
    </Container>
  );
}
