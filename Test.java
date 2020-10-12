package pack1;

public class Test {
	public static void main(String args[]){
		CPU cpu=new CPU();
		cpu.setSpeed(2200);
		cpu.setCores(8);
		HardDisk disk=new HardDisk();
		disk.setAmount(200);
		disk.setSpeed(7200);
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}

}
