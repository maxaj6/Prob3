package prob3ex;

public class FighterAiracraft extends AirPlane{
	
    private String type = "戦闘機";
    //  タイプの取得
    public String getType(){
        return type;
    }
	
    //  飛行する
    public void fly(){
        System.out.println("攻撃に出るために飛行します。");
    }
    //  戦闘する
    public void fight(){
        System.out.println("戦闘します。");
    }
}
