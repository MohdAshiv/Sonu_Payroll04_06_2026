package utilities;

public class HMRC_Tax 
{
	static int liability[] =new int[3];
	
	public static int[] HMRC_Taxes(int Weekno) 
	{  
	    //Declaring a variable for switch expression  
	    int number=Weekno;  
	    //Switch expression  
	    switch(number)
	    {  
	    //Case statements  
	    case 52: 
	    {
	    	
	    	liability[0]=6240;
	    	liability[1]=9568;
	    	liability[2]=50270;
	    	break;
	    }
	    
	    
	    case 51: 
	    {
	    	
	    	liability[0]=6120;
	    	liability[1]=9384;
	    	liability[2]=49304;
	    	break;
	    }
	    case 50: 
	    {
	    	
	    	liability[0]=6000;
	    	liability[1]=9200;
	    	liability[2]=48337;
	    	break;
	    }  
	    case 49:
	    {
	    	
	    	liability[0]=5880;
	    	liability[1]=9016;
	    	liability[2]=47370;
	    	break;
	    } 
	    
	    case 48:
	    {
	    	
	    	liability[0]=5760;
	    	liability[1]=8832;
	    	liability[2]=46404;
	    	break;
	    }
	    
	    case 47:
	    {
	    	
	    	liability[0]=5640;
	    	liability[1]=8648;
	    	liability[2]=45437;
	    	break;
	    }
	    
	    case 46:
	    {
	    	
	    	liability[0]=5520;
	    	liability[1]=8464;
	    	liability[2]=44470;
	    	break;
	    }
	    
	    case 45:
	    {
	    	
	    	liability[0]=5400;
	    	liability[1]=8280;
	    	liability[2]=43503;
	    	break;
	    }
	    
	    case 44:
	    {
	    	
	    	liability[0]=5282;
	    	liability[1]=8096;
	    	liability[2]=42537;
	    	break;
	    }
	    
	    case 43:
	    {
	    	
	    	liability[0]=5160;
	    	liability[1]=7912;
	    	liability[2]=41570;
	    	break;
	    }
	    
	    case 42:
	    {
	    	
	    	liability[0]=5040;
	    	liability[1]=7728;
	    	liability[2]=40603;
	    	break;
	    }
	    
	    case 41:
	    {
	    	
	    	liability[0]=4920;
	    	liability[1]=7544;
	    	liability[2]=39636;
	    	break;
	    }
	    
	    case 40:
	    {
	    	
	    	liability[0]=4800;
	    	liability[1]=7360;
	    	liability[2]=38670;
	    	break;
	    }
	    
	    case 39:
	    {
	    	
	    	liability[0]=4680;
	    	liability[1]=7176;
	    	liability[2]=37703;
	    	break;
	    }
	    
	    case 38:
	    {
	    	
	    	liability[0]=4560;
	    	liability[1]=6992;
	    	liability[2]=36736;
	    	break;
	    }
	    
	    case 37:
	    {
	    	
	    	liability[0]=4440;
	    	liability[1]=6808;
	    	liability[2]=35770;
	    	break;
	    }
	    
	    case 36:
	    {
	    	
	    	liability[0]=4320;
	    	liability[1]=6624;
	    	liability[2]=34803;
	    	break;
	    }
	    
	    case 35:
	    {
	    	
	    	liability[0]=4200;
	    	liability[1]=6440;
	    	liability[2]=33836;
	    	break;
	    }
	    
	    case 34:
	    {
	    	
	    	liability[0]=4080;
	    	liability[1]=6256;
	    	liability[2]=32869;
	    	break;
	    }
	    
	    case 33:
	    {
	    	
	    	liability[0]=3960;
	    	liability[1]=6072;
	    	liability[2]=31903;
	    	break;
	    }
	    
	    case 32:
	    {
	    	
	    	liability[0]=3840;
	    	liability[1]=5888;
	    	liability[2]=30936;
	    	break;
	    }
	    
	    case 31:
	    {
	    	
	    	liability[0]=3720;
	    	liability[1]=5704;
	    	liability[2]=29969;
	    	break;
	    }
	    
	    case 30:
	    {
	    	
	    	liability[0]=3600;
	    	liability[1]=5520;
	    	liability[2]=29002;
	    	break;
	    }
	    
	    case 29:
	    {
	    	
	    	liability[0]=3480;
	    	liability[1]=5336;
	    	liability[2]=28036;
	    	break;
	    }
	    
	    case 28:
	    {
	    	
	    	liability[0]=3360;
	    	liability[1]=5152;
	    	liability[2]=27069;
	    	break;
	    }
	    
	    case 27:
	    {
	    	
	    	liability[0]=3240;
	    	liability[1]=4968;
	    	liability[2]=26102;
	    	break;
	    }
	    
	    case 26:
	    {
	    	
	    	liability[0]=3120;
	    	liability[1]=4784;
	    	liability[2]=25135;
	    	break;
	    }
	    
	    case 25:
	    {
	    	
	    	liability[0]=3000;
	    	liability[1]=4600;
	    	liability[2]=24169;
	    	break;
	    }
	    
	    case 24:
	    {
	    	
	    	liability[0]=2880;
	    	liability[1]=4416;
	    	liability[2]=23202;
	    	break;
	    }
	    
	    case 23:
	    {
	    	
	    	liability[0]=2760;
	    	liability[1]=4232;
	    	liability[2]=22235;
	    	break;
	    }
	    
	    case 22:
	    {
	    	
	    	liability[0]=2640;
	    	liability[1]=4048;
	    	liability[2]=21269;
	    	break;
	    }
	    
	    case 21:
	    {
	    	
	    	liability[0]=2520;
	    	liability[1]=3864;
	    	liability[2]=20302;
	    	break;
	    }
	    
	    case 20:
	    {
	    	
	    	liability[0]=2400;
	    	liability[1]=3680;
	    	liability[2]=19335;
	    	break;
	    }
	    
	    case 19:
	    {
	    	
	    	liability[0]=2280;
	    	liability[1]=3496;
	    	liability[2]=18368;
	    	break;
	    }
	    
	    case 18:
	    {
	    	
	    	liability[0]=2160;
	    	liability[1]=3312;
	    	liability[2]=17402;
	    	break;
	    }
	    
	    case 17:
	    {
	    	
	    	liability[0]=2040;
	    	liability[1]=3128;
	    	liability[2]=16435;
	    	break;
	    }
	    
	    case 16:
	    {
	    	
	    	liability[0]=1920;
	    	liability[1]=2944;
	    	liability[2]=15468;
	    	break;
	    }
	    
	    case 15:
	    {
	    	
	    	liability[0]=1800;
	    	liability[1]=2760;
	    	liability[2]=14501;
	    	break;
	    }
	    
	    case 14:
	    {
	    	
	    	liability[0]=1680;
	    	liability[1]=2576;
	    	liability[2]=13535;
	    	break;
	    }
	    
	    case 13:
	    {
	    	
	    	liability[0]=1560;
	    	liability[1]=2392;
	    	liability[2]=12568;
	    	break;
	    }
	    
	    case 12:
	    {
	    	
	    	liability[0]=1440;
	    	liability[1]=2208;
	    	liability[2]=11601;
	    	break;
	    }
	    
	    case 11:
	    {
	    	
	    	liability[0]=1320;
	    	liability[1]=2024;
	    	liability[2]=10635;
	    	break;
	    }
	    
	    case 10:
	    {
	    	
	    	liability[0]=1200;
	    	liability[1]=1840;
	    	liability[2]=9668;
	    	break;
	    }
	    
	    case 9:
	    {
	    	
	    	liability[0]=1080;
	    	liability[1]=1656;
	    	liability[2]=8701;
	    	break;
	    }
	    
	    case 8:
	    {
	    	
	    	liability[0]=960;
	    	liability[1]=1472;
	    	liability[2]=7734;
	    	break;
	    }
	    
	    case 7:
	    {
	    	
	    	liability[0]=840;
	    	liability[1]=1288;
	    	liability[2]=6768;
	    	break;
	    }
	    
	    case 6:
	    {
	    	
	    	liability[0]=720;
	    	liability[1]=1104;
	    	liability[2]=5801;
	    	break;
	    }
	    
	    case 5:
	    {
	    	
	    	liability[0]=600;
	    	liability[1]=920;
	    	liability[2]=4834;
	    	break;
	    }
	    
	    case 4:
	    {
	    	
	    	liability[0]=480;
	    	liability[1]=736;
	    	liability[2]=3867;
	    	break;
	    }
	    
	    case 3:
	    {
	    	
	    	liability[0]=360;
	    	liability[1]=552;
	    	liability[2]=2901;
	    	break;
	    }
	    
	    case 2:
	    {
	    	
	    	liability[0]=240;
	    	liability[1]=368;
	    	liability[2]=1934;
	    	break;
	    }
	    
	    case 1:
	    {
	    	
	    	liability[0]=120;
	    	liability[1]=184;
	    	liability[2]=967;
	    	break;
	    }
	   
	    
	    
	    default:System.out.println("Not found");  
	    }
		return liability;  
	}  

}
