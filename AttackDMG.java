//№1 Хранит в себе урон нападающего и защиту обороняющегося
public class AttackDMG{
	private int PlayerDMG;
	private int EnemyDFN;
	
	AttackDMG()  //Конструктор
	{
		PlayerDMG = 0;
		EnemyDFN = 0;
	}
	
	//Методы установки значений урона и защиты извне
	public void setPlayerDMG(int DMG)
	{
		PlayerDMG = DMG;
	}
	
	public void setEnemyDFN(int DFN)
	{
		EnemyDFN = DFN;
	}
	
	//Методы получения значений урона и защиты извне
	public int getPlayerDMG()
    {
        return PlayerDMG;
    }

    public int getEnemyDFN()
    {
        return EnemyDFN;
    }
	
	//Метод расчета наносимого урона
	public int FinalDMG() 
	{
		if (PlayerDMG - EnemyDFN < 0)
			return 0;
		return PlayerDMG - EnemyDFN;
	}
}