import java.util.ArrayList;

public class Computer implements __________(1)__________ {
    private ArrayList<__________(2)__________> monitorList = new ArrayList<>();
    private ArrayList<Ram> ramList = new ArrayList<>();
    private ArrayList<HardDisk> hddList = new ArrayList<>();
    private Mouse mouse;

    @Override
    public void addMonitor(Monitor monitor) {
        monitorList.add(monitor);
    }

    @Override
    public void addRam(Ram ram) {
        ramList.add(ram);
    }

    @Override
    public void addHardDisk(HardDisk hardDisk) {
        hddList.add(hardDisk);
    }

    @Override
    public void addMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public ArrayList<Monitor> getMonitorList() {
        return monitorList;
    }

    public ArrayList<Ram> getRamList() {
        return ramList;
    }

    public ArrayList<HardDisk> getHddList() {
        return hddList;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public int getRamCapacity() {
        int capacity = 0;
        for (Ram ram : ramList)
            capacity += ram.getRamCapacity();
        return capacity;
    }

    public int getHddCapacity() {
        int capacity = 0;
        for (HardDisk hardDisk : hddList)
            capacity += hardDisk.getHardDiskCapacity();
        return capacity;
    }
}
