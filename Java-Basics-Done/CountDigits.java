class CountDigits
public static void main(String[] args)
    {
      int num =45892;
        int i = 0;
        while(num>0)
        {
            i++;
            num=num/10;
        }
        System.out.println(i);
    }    
}
