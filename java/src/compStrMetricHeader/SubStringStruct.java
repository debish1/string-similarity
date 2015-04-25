/*
 Copyright 2014 Neustar Inc.
 
 Licensed under the Apache License, Version 2.0(the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
 http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */


// Package header classes into one
package compStrMetricHeader;

//import java.util.List; // For the list collection
import java.util.*; // For the list collection

// A structure for each substring group in the string similarity
// score calculations
public class SubStringStruct{
    // Number of characters which fall into the same substring
    // group(same incline)
    public int cntr;
    // List of characters in the substring
    public LinkedList <Integer> subStrList = new LinkedList<Integer>();
    // Initialize the substring variables
    public SubStringStruct(){
        cntr = 0;
        subStrList.clear();
    }
}
