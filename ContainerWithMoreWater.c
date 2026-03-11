int maxArea(int* height, int heightSize) {
    int i=0,j=heightSize-1,h,a,maxa=0,v;
    while(i<j){
        h=(height[i]<height[j])?height[i]:height[j];
        v=j-i;
        a=h*v;
        if(a>maxa){
            maxa=a;
        }
        if(height[i]<height[j]){
            i++;
        }
        else{
            j--;
    }}
  return maxa;
}