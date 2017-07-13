package game.action;

import com.sun.org.apache.bcel.internal.generic.NEW;
import game.action.api.Action;
import game.action.complex.sell.SellAnimalAction;
import game.action.cook.CookAMealMenu;
import game.action.simple.CustomNameInteract;
import game.action.simple.backpack.Show;
import game.action.simple.build.BuildMachine;
import game.action.simple.check.*;
import game.action.simple.clinic.HealUp;
import game.action.simple.collect.CollectRocks;
import game.action.simple.collect.CollectWood;
import game.action.simple.drop.DropFromBackPackMenu;
import game.action.simple.fill.Fill;
import game.action.simple.fishing.Fishing;
import game.action.simple.fishing.GiveFish;
import game.action.simple.greenhouse.ChangeWeather;
import game.action.simple.greenhouse.RepairGreenhouse;
import game.action.simple.gym.EnergyMenu;
import game.action.simple.gym.HealthMenu;
import game.action.simple.gym.Train;
import game.action.simple.manage.ManageMission;
import game.action.simple.mission.*;
import game.action.simple.put.PutInToStorageBoxMenu;
import game.action.simple.save.SaveMenu;
import game.action.simple.sleep.SleepMenu;
import game.action.simple.store.BuyStore;
import game.action.simple.store.butchery.ButcheryBuyStore;
import game.action.simple.store.butchery.ButcheryCheck;
import game.action.simple.store.clinic.ClinicBuyStore;
import game.action.simple.store.clinic.ClinicCheck;
import game.action.simple.store.clinic.ClinicHealUp;
import game.action.simple.store.general.GeneralStoreBuy;
import game.action.simple.store.general.GeneralStoreCheck;
import game.action.simple.store.groceries.GroceriesBuyStore;
import game.action.simple.store.groceries.GroceriesCheck;
import game.action.simple.store.kitchen.KitchenCheck;
import game.action.simple.store.ranch.RanchBuyAnimal;
import game.action.simple.store.ranch.RanchBuyItem;
import game.action.simple.store.ranch.RanchCheck;
import game.action.simple.store.workshop.WorkshopBuy;
import game.action.simple.store.workshop.WorkshopCheck;
import game.action.simple.take.TakeFromStorageBoxMenu;
import game.action.simple.workshop.Disassemble;
import game.action.simple.workshop.Make;
import game.animals.properties.LivingPropertyType;
import game.entities.type.living.animal.AnimalType;
import game.entities.type.storage.Backpack;
import game.entities.type.storage.StorageBox;
import game.interactable.*;
import game.interactable.cafe.MissionBoard;
import game.places.Gym;
import game.places.Laboratory;
import game.places.store.Clinic;
import game.places.store.Greenhouse;
import game.places.store.Ranch;
import game.places.store.Workshop;
import ui.BuyAnimalActionMenu;

/**
 * Created by ahay on 5/2/17.
 * <p>
 * GIBILI GIBILI
 */
public class ActionHelper {
    private static ActionHelper ourInstance = new ActionHelper();
    private boolean hasBeenAdded = false;

    public static ActionHelper getInstance() {
        return ourInstance;
    }

    private ActionHelper() {
    }

    private void addActions(Interactable interactable, Action... actions) {
        for (Action a : actions) addAction(interactable, a);
    }

    private void addAction(Interactable interactable, Action action) {
        interactable.addAction(action);
    }

    public void run() {
        if (!hasBeenAdded) {
            hasBeenAdded = true;
            //Butchery
            addActions(Butchery.getInstance(), new CustomNameInteract(new Sell(), "Sell an item"));
//            addActions(Butchery.getInstance(), new CustomNameInteract(new BuyStore(), "BuyStore an item"));
            //StorageBox
            addActions(StorageBox.getInstance(), new CustomNameInteract(new PutInToStorageBoxMenu(), "Put in item"));
            addActions(StorageBox.getInstance(), new CustomNameInteract(new TakeFromStorageBoxMenu(), "Take out item"));
          //  addAction(new PutInToStorageBoxMenu() , new Show());
           // addAction(StorageBox.getInstance() , new CustomNameInteract(new Show() , "Show"));
           // addAction(new PutInToStorageBoxMenu() , new CustomNameInteract(new Show() , "Show"));
            //Kitchen
            addActions(Kitchen.getInstance(), new KitchenCheck(), new CustomNameInteract(new CheckToolShelfMenu(), "Check Tool Shelf"));
            addActions(Kitchen.getInstance(), new CustomNameInteract(new CheckRecipes(), "Check recpies"));
            //Backpack
            addActions(Backpack.getInstance(), new CustomNameInteract(new DropFromBackPackMenu(), "Drop this item"));
            addActions(Backpack.getInstance(), new CustomNameInteract(new CheckBackPackItemStatusMenu(), "Status"));

            //Bed
            addActions(Bed.getInstance(), new CustomNameInteract(new SleepMenu(), "Sleep without saving"));
            addActions(Bed.getInstance(), new CustomNameInteract(new SaveMenu(), "Sleep and save game"));
            //Chicken Sell Actions and Menus
//            addActions(Sell.getInstance(), new CustomNameInteract(sellHen, "Chicken"));
//            addActions(sellHen, new CustomNameInteract(SellAnimalActionMenu.getInstance(), "Sell this animal"));
//            addActions(sellHen, new CustomNameInteract(new CheckAnimalStatusForSell(), "Status"));
            //Cow Sell Actions and Menus
//            addActions(Sell.getInstance(), new CustomNameInteract(sellCow, "Cow"));
//            addActions(sellCow, new CustomNameInteract(new CheckAnimalStatusForSell(), "Status"));
//            addActions(sellCow, new CustomNameInteract(SellAnimalActionMenu.getInstance(), "Sell this animal"));
            //Sheep Sell Action and Menus
//            addActions(Sell.getInstance(), new CustomNameInteract(sellSheep, "Sheep"));
//            addActions(sellSheep, new CustomNameInteract(new CheckAnimalStatusForSell(), "Status"));
//            addActions(sellSheep, new CustomNameInteract(SellAnimalActionMenu.getInstance(), "Sell this animal"));
            //Hen BuyStore Action and Menus
//            addActions(BuyStore.getInstance(), new CustomNameInteract(buyHen, "Chicken"));
//            addActions(buyHen, new CustomNameInteract(new BuyAnimalActionMenu(), "BuyStore this animal"));
//            addActions(buyHen, new CustomNameInteract(new CheckAnimalStatusForBuy(), "Status"));
            //Cow BuyStore Action and Menus
//            addActions(BuyStore.getInstance(), new CustomNameInteract(buyCow, "Cow"));
//            addActions(buyCow, new CustomNameInteract(new BuyAnimalActionMenu(), "BuyStore this animal"));
//            addActions(buyCow, new CustomNameInteract(new CheckAnimalStatusForBuy(), "Status"));
            //Sheep BuyStore Action and Menus
//            addActions(BuyStore.getInstance(), new CustomNameInteract(buySheep, "Sheep"));
//            addActions(buySheep, new CustomNameInteract(new BuyAnimalActionMenu(), "BuyStore this animal"));
//            addActions(buySheep, new CustomNameInteract(new CheckAnimalStatusForBuy(), "Status"));
            //GroceriesStore
            //TODO : add sell and buy fruit classes
            addActions(GroceryStore.getInstance(), new GroceriesBuyStore(), new GroceriesCheck());
                 //  new CustomNameInteract(Sell.getInstance(), "Sell an item"), new CustomNameInteract(BuyStore.getInstance(), "BuyStore an item"));
            //GeneralStore
            //TODO: add CookMaterial buy & sell , add cooktools buy & sell
            addActions(GeneralStore.getInstance(), new GeneralStoreCheck(),
                    new CustomNameInteract(Sell.getInstance(), "Sell an item"), new GeneralStoreBuy());
            //Barn
            //Pond
            addActions(Pond.getInstance(), new CustomNameInteract(new Fill(), "Fill a Watering Can "));
            //River
            addActions(River.getInstance(), new CustomNameInteract(new Fishing(), "Start fishing"));
            addActions(new Fishing(), new CustomNameInteract(new GiveFish(), "Number of caughted fish"));
            //Rocks Actions and Menus
            addActions(Rocks.getInstance(), new CustomNameInteract(new CollectRocks(), "Collect Stone"),
                    new CustomNameInteract(new CollectRocks(), "Collect Iron Ore"),
                    new CustomNameInteract(new CollectRocks(), "Collect Silver Ore"),
                    new CustomNameInteract(new CollectRocks(), "Collect Adamantium Ore"));
            //Woods Actions and Menus
            addActions(Woods.getInstance(), new CustomNameInteract(new CollectWood(), "Collect Branch"),
                    new CustomNameInteract(new CollectWood(), "Collect Old Lumber"),
                    new CustomNameInteract(new CollectWood(), "Collect Pine Lumber"),
                    new CustomNameInteract(new CollectWood(), "Collect Ore Lumber"));
            //MissionBoard Actions and Menus
            addActions(MissionBoard.getInstance(), new CustomNameInteract(CheckMissions.getInstance(), "Check available missions"));
            addActions(MissionBoard.getInstance(), new CustomNameInteract(ManageMission.getInstance(), "Manage active missions"));
            addActions(MissionBoard.getInstance(), new CustomNameInteract(new Claim(), "Claim prize"));
            addActions(MissionBoard.getInstance(), new CustomNameInteract(new RemoveMission(), "Remove ths mission"));
            addActions(CheckMissions.getInstance(), new CustomNameInteract(new BriefingMission(), "Mission briefing"));
            addActions(CheckMissions.getInstance(), new CustomNameInteract(new AcceptMission(), "Accept this mission"));
            addActions(ManageMission.getInstance(), new CustomNameInteract(new BriefingMission(), "Mission Briefing"));
            addActions(ManageMission.getInstance(), new CustomNameInteract(new CheckMissionsProgress(), "Mission progress"));
            //DiningTable Actions and Menus
//            addActions(DiningTable.getInstance(), new CustomNameInteract(new CheckDiningTableMenu(), "Check the menu"),
//                    new CustomNameInteract(new BuyMeal(), "BuyStore a meal"));
            //Ranch Actions and Menus
            addActions(Ranch.getInstance(), new RanchCheck(),new RanchBuyItem(), new RanchBuyAnimal());
            //Workshop
            addActions(Workshop.getInstance(), new WorkshopCheck(),
                    new WorkshopBuy(),
                    new CustomNameInteract(new game.action.simple.workshop.Repair(), "Repair a tool"),
                    new CustomNameInteract(new Disassemble(), "Disassemble a tool"));
            //Clinic
//            addActions(Clinic.getInstance(), new CustomNameInteract(new CheckShopMenu(), "Check this shop"),
//                    new CustomNameInteract(BuyStore.getInstance(), "BuyStore an item"),
//                     new CustomNameInteract(new HealUp(), "Heal up"));
            addActions(Clinic.getInstance() , new ClinicCheck() , new ClinicBuyStore() , new ClinicHealUp());
            //Laboratory
            addActions(Laboratory.getInstance(), new CustomNameInteract(new CheckMachine(), "Check machines"),
                    new CustomNameInteract(new BuildMachine(), "Build a machine"));
            //Gym
            addActions(Gym.getInstance(), new CustomNameInteract(HealthMenu.getInstance(), "Health"),
                    new CustomNameInteract(EnergyMenu.getInstance(), "Energy"));
            addActions(HealthMenu.getInstance(), new CustomNameInteract(LivingPropertyValueType.getInstance(), "Consumption rate"),
                    new CustomNameInteract(LivingPropertyValueType.getInstance(), "Refill rate"),
                    new CustomNameInteract(LivingPropertyValueType.getInstance(), "Max amount"));
            addActions(EnergyMenu.getInstance(), new CustomNameInteract(LivingPropertyValueType.getInstance(), "Consumption rate"),
                    new CustomNameInteract(LivingPropertyValueType.getInstance(), "Refill rate"),
                    new CustomNameInteract(LivingPropertyValueType.getInstance(), "Max amount"));
            addActions(LivingPropertyValueType.getInstance(), new CustomNameInteract(new CheckStatus(), "Status"),
                    new CustomNameInteract(new Train(), "Train"));
            //Greenhouse
            addAction(Greenhouse.getInstance(), new RepairGreenhouse());
            addActions(WheatherMachine.getInstance(), new CustomNameInteract(new ChangeWeather(), "Spring weather"),
                    new CustomNameInteract(new ChangeWeather(), "Summer weather"),
                    new CustomNameInteract(new ChangeWeather(), "Autumn weather"),
                    new CustomNameInteract(new ChangeWeather(), "Tropical weather"));

//TODO: delete below tthis line
//            StorageBox.getInstance().put(Wood.BRANCH, 19);
//            StorageBox.getInstance().put(Shovel.ADAMANTIUM, 1);
//            Backpack.getInstance().put(Wood.BRANCH, 19);
//            Backpack.getInstance().put(Shovel.ADAMANTIUM, 1);
       //     Backpack.getInstance().put(new AnimalType("Cow", LivingPropertyType.HEALTH, LivingPropertyType.SATIETY), 10);
           //  Backpack.getInstance().put(AnimalType.CHICKEN, 10);
            //Backpack.getInstance().put(AnimalType.SHEEP, 10);
//TODO: delete above this line
            addActions(Butchery.getInstance(), new ButcheryBuyStore(), new ButcheryCheck());
            //addActions(Butchery.getInstance() , SellAnimalAction.SELL_ANIMAL_SHEEP);
        }
    }

    public int getAnimalActionMoney(String name) {
        switch (name) {
//            case "Chicken":
//                return buyHen.getMoney();
//            case "Cow":
//                return buyCow.getMoney();
//            case "Sheep":
//                return buySheep.getMoney();
        }
        return 0;
    }

    public int getIntractablesValue(SellAnimalAction sellAnimalAction) {
        switch (sellAnimalAction.getName()) {
//            case "Cow":
//                return this.sellCow.getMoney();
//            case "Chicken":
//                return this.sellHen.getMoney();
//            case "Sheep":
//                return this.sellSheep.getMoney();
        }
        return 0;
    }
}
