void setup(){
     size(400,400);  

    }

    void draw(){
      for(int i=10; i>0; i--){
        if(i % 2 == 0){
          fill(#F00A0A);
        }
        else {
          fill(#0A0909);
        }
          
ellipse(200,100,i*10,i*10);

    }
  }
                   
