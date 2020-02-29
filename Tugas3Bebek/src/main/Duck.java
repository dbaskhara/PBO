package main;
import attack.*;
import defense.*;
import fly.*;
import sound.*;
public class Duck 
{
    private AttackBehaviour attackBehaviour;
    private DefenceBehaviour defenceBehaviour;
    private FlyBehaviour flyBehaviour;
    private SoundBehaviour SoundBehaviour;
    public Duck(AttackBehaviour a , DefenceBehaviour b , FlyBehaviour c , SoundBehaviour d)
    {
    	this.attackBehaviour = a;
    	this.defenceBehaviour = b;
    	this.flyBehaviour = c;
    	this.SoundBehaviour = d;
    }
    public void attack()
    {
    	attackBehaviour.attack();
    }
    public void defence()
    {
    	defenceBehaviour.defence();
    }
    public void fly()
    {
    	flyBehaviour.fly();
    }
    public void sound()
    {
    	SoundBehaviour.sound();
    }
}
