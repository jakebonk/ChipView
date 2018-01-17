[![](https://jitpack.io/v/jakebonk/ChipView.svg)](https://jitpack.io/#jakebonk/ChipView)

# Chip View
This is a simple chip library that allows you to create your own chip views and views for the listview all within one adapter.

## Example

![Basic Example](https://thumbs.gfycat.com/HopefulWelltodoClingfish-size_restricted.gif)

## Download library with Jitpack.io
Add this to your build.gradle file for your app.
```java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```	

Add this to your dependencies in build.gradle for your project.
```java
	dependencies {
	        compile 'com.github.jakebonk:ChipView:1.0.1'
	}
```
## Usage
Create a ChipView in your xml file
```
  <com.allyants.chipview.ChipView
        android:id="@+id/cvTag"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```
Then in your Java code create and set the SimpleChipAdapter.

```java
ChipView cvTag = (ChipView)findViewById(R.id.cvTag);
        ArrayList<Object> data = new ArrayList<>();
        data.add("First Item");
        data.add("Second Item");
        data.add("Third Item");
        data.add("Fourth Item");
        data.add("Fifth Item");
        data.add("Sixth Item");
        data.add("Seventh Item");
        SimpleChipAdapter adapter = new SimpleChipAdapter(data);
        cvTag.setAdapter(adapter);
```
If you want to create your own adapter just extend the ChipAdapter class and use the SimpleChipAdapter class as a reference.
