int x1 = 0;
int x2 = 600;
int one = 1;
void setup(){
     size(600,600);  

    }

    void draw(){
      background(#1CEA2B);
      for(int i=10; i>0; i--){
        if(i % 2 == 0){
          noFill();
        }
        else {
          noFill();
        }
          
ellipse(x1,100,i*10,i*10);
ellipse(x2,100,i*10,i*10);


    }
    x1+=10*one;
    x2-=10*one;
    if(x1 >= 600){
      one=-1;
    } 
  }
