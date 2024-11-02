public class Defence
{
	private int HelmetDefence;        //показатель защиты шлема
    private int CuirassDefence;         //показатель защиты кирассы
    private int GlovesDefence;         //показатель защиты перчаток
    private int GreavesDefence;          //показатель защиты поножей
    private int BootsDefence;           //показатель защиты сапог

	Defence()  //Конструктор
	{
		HelmetDefence = 0;
        CuirassDefence = 0;
        GlovesDefence = 0;
        GreavesDefence = 0;
        BootsDefence = 0;
	}
	
	//Метод установки значений защиты извне
    public void setDefence(int Helm, int Cuir, int Glov, int Grea, int Boot)
    {
        HelmetDefence = Helm;
        CuirassDefence = Cuir;
        GlovesDefence = Glov;
        GreavesDefence = Grea;
        BootsDefence = Boot;
    }
	
	//Методы получения значений урона и защиты извне
    public int getHelmDefence() 
    {
        return HelmetDefence;
    }

    public int getCuirDefence() 
    {
        return CuirassDefence;
    }

    public int getGlovDefence() 
    {
        return GlovesDefence;
    }

    public int getGreaDefence() 
    {
        return GreavesDefence;
    }

    public int getBootDefence() 
    {
        return BootsDefence;
    }

    //Метод расчета полной брони
    public int AllDefence()
	{
		return HelmetDefence + CuirassDefence + GlovesDefence + GreavesDefence + BootsDefence;
	}
}