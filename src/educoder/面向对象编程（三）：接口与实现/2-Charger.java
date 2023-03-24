//Charger.java ,请完成Charger的完整定义，使它满足主方法的输出内容和格式的要求。
package guet;

public class Charger implements ICharger{
    @Override
    public boolean connectPowerline(float voltage) {
		boolean b=200<=voltage&&voltage<=240;
		if(b){
			return true;
		}

System.out.print("交流电压不在[200,240]范围,无法充电");
        return false;
    }

    @Override
    public void powerOff() {
        System.out.println("充电器停止充电");
    }

    @Override
    public int doCharge(int currentEnergy) {
		if(currentEnergy==100){
			powerOff();
            return 100;
		}
        else if (currentEnergy>95&&currentEnergy<100){
			System.out.println("已充电到100%");
            powerOff();
            return 100;
        }else if (currentEnergy>=0){
            currentEnergy+=5;
            System.out.format("已充电到%d%%",currentEnergy);
             System.out.print('\n');
            return currentEnergy;
        }else {
             System.out.println("非法电量");
             return currentEnergy;
        }

    }
}
