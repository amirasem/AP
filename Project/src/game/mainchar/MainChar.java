package game.mainchar;

import game.animals.properties.LivingProperty;
import game.animals.properties.values.LivingPropertyValueType;
import game.entities.type.eatable.V;
import game.time.Watch;
import game.time.farmer.Sleep;
import game.time.farmer.SleepHandler;
import game.time.farmer.WakeUp;

import java.util.ArrayList;

/**
 * Created by AmirHosein on 7/8/2017.
 * ASAY
 */
public class MainChar  {
    LivingProperty stamina  = new LivingProperty(V.S , 100 ,30 , 100 , 100 ) {
        @Override
        public void addToProperty(LivingPropertyValueType type, int value) {
            super.addToProperty(type, value);
        }

        @Override
        public int getValueOf(LivingPropertyValueType type) {
            return super.getValueOf(type);
        }
    };
    LivingProperty health  = new LivingProperty(V.H , 500 , 100 , 100 , 500) {
        @Override
        public void addToProperty(LivingPropertyValueType type, int value) {
            super.addToProperty(type, value);
        }

        @Override
        public int getValueOf(LivingPropertyValueType type) {
            return super.getValueOf(type);
        }
    };
    LivingProperty Energy = new LivingProperty(V.E , 1000 , 100 , 100 , 1000) {
        @Override
        public void addToProperty(LivingPropertyValueType type, int value) {
            super.addToProperty(type, value);
        }

        @Override
        public int getValueOf(LivingPropertyValueType type) {
            return super.getValueOf(type);
        }
    };
    LivingProperty satiety = new LivingProperty(V.SA , 500 ,100 , 10 , 500) {
        @Override
        public void addToProperty(LivingPropertyValueType type, int value) {
            super.addToProperty(type, value);
        }

        @Override
        public int getValueOf(LivingPropertyValueType type) {
            return super.getValueOf(type);
        }
    };
    private boolean sleep = false;


    public void  sleep(){
        this.sleep = true;
        Watch.getInstance().add(new Sleep());
        Watch.getInstance().run();
    }
    public void wakeup()
    {
        this.sleep = true;
        Watch.getInstance().add(new WakeUp());
        Watch.getInstance().run();
    }
    public void phyicalPropertyEffects()
    {
        if (satiety.getValueOf(LivingPropertyValueType.CURRENT)==0)
        {
            health.addToProperty(LivingPropertyValueType.CURRENT , -10);
            if (health.getValueOf(V.C)==0) sleep();
        }

    }
}
