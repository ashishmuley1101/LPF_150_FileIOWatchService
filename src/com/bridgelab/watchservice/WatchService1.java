package com.bridgelab.watchservice;


	
	import java.nio.file.FileSystems;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.nio.file.WatchEvent;
	import java.nio.file.WatchService;
	import java.nio.file.WatchKey;
	
	import static java.nio.file.StandardWatchEventKinds.*;

	import java.io.IOException;

	public class WatchService1 {

	    public static void main(String[] args) throws IOException, InterruptedException {

	        // Activate watch Service
	       WatchService watchService = FileSystems.getDefault().newWatchService();

	        // Convert location to file path
	        Path path = Paths.get("D:\\sample\\watchservice");

	        // Register watch service on above path ==> Pass events to be watched
	        // (Create/Delete/Modify)
	        path.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

	        boolean poll = true;
	        while (poll) {

	            // Reference / Pointer current file or folder watching
	            WatchKey key = watchService.take();

	            // Printing the events (Create / Modify / Delete)
	            for (WatchEvent<?> event : key.pollEvents()) {
	                System.out.println("Event kind : " + event.kind() + " - File : " + event.context()  +event.toString());

	            }

	            // Reseting the reference so that it can be used later
	            poll = key.reset();
	        }

	    }

	}


