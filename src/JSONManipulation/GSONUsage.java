package JSONManipulation;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.json.*;

public class GSONUsage {

	public static void main(String[] args) {
		JSONArray array = readFileContent();
		convertJSONArraytoArrayList(array);
	}

	private static void convertJSONArraytoArrayList(JSONArray array) {

		// Use method fromJson() to deserializes the specified Json into an object
		// of the specified class
		final ArrayList<?> jsonArray = new Gson().fromJson(array.toString(), ArrayList.class);
		log("\nArrayList: " + jsonArray);

		String ar = new Gson().toJson(jsonArray);

		log("\nString: " + ar);

	}

	private static JSONArray readFileContent() {
		JSONArray crunchifyArray = new JSONArray();
		String lineFromFile;

		try (BufferedReader bufferReader = new BufferedReader(
				new FileReader("/Users/ravikumarks/Documents/Practice/Programming/crunchify-gson.txt"))) {

			while ((lineFromFile = bufferReader.readLine()) != null) {
				if (lineFromFile != null && !lineFromFile.isEmpty()) {
					JSONObject crunchifyObject = new JSONObject();
					log("Line: ==>" + lineFromFile);

					// escape any blank space between tokens
					String[] split = lineFromFile.split("\\s+");
					crunchifyObject.put("companyName", split[0]);
					crunchifyObject.put("address", split[1]);
					crunchifyObject.put("description", split[2]);
					crunchifyArray.put(crunchifyObject);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\nJSONArray: " + crunchifyArray.toString());
		return crunchifyArray;

	}

	private static void log(Object string) {
		System.out.println(string);
	}

}
