$(
function()
{

    let BigCount=prompt("대수의 법칙을 증명할 수는?", 1000)
    
    let numArr=[0,0,0,0,0,0]
    for(let i=0; i<BigCount; i++)
    {
        

       
        let random = Math.floor(Math.random()*6);
        numArr[random]++
    }
    

    for(let i = 0; i<numArr.length; i++){
        $('h1.num'+(i+1)).text(numArr[i])
        //document.querySelector('h1.num'+(i+1)).innerText=numArr[i]
    }

    let max = 0
    let maxIndex =0 
    for(let i=1; i<=6; i++){

        //let value=document.querySelector('h1.num'+i).innerText
        let value=$('h1.num'+i).text()
        
        if(max<value)
        {
            max=value;
            maxIndex= i
        }
        value = (value/BigCount)*100
        $('h2.num'+i).text(parseFloat(value).toFixed(2)+'%')
        //.querySelector('h2.num'+i).innerText = parseFloat(value).toFixed(2)+'%'
    }
    
    $('h1.numTitle'+maxIndex).addClass('max')
    $('h1.num'+maxIndex).addClass('max')
    $('h2.num'+maxIndex).addClass('max')
    
}
)
