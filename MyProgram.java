public class MyProgram{
	public static void main (String args[]){
		AttackDMG DMG = new AttackDMG();
		DMG.setPlayerDMG(5);
		DMG.setEnemyDFN(3);
		System.out.printf("При уроне игрока %d и защите противника %d он получит %d единицы урона \n", DMG.getPlayerDMG(), DMG.getEnemyDFN(), DMG.FinalDMG());
	}
}