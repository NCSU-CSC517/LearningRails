interface PCBuilder {
	// PCBuilder __________(4)__________(int size);
	PCBuilder addMonitor(int size);
	PCBuilder addHardDisk(int size);
	PCBuilder addRam(int size);
	// PCBuilder __________(5)__________(String type);
	PCBuilder addMouse(String type);
}