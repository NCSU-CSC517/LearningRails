public class ComputerUpgrader {
	// public void upgradeRAM(__________(2)__________ d) {
	public void upgradeRAM(HardwareUpgradable d) {
		d.addRam(16);	
	}

	// public void upgradeOS(__________(3)__________ d) {
	public void upgradeOS(Computer d) {
		d.updateOS();
	}
}
