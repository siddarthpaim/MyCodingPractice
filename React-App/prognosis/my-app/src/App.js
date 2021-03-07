import React from 'react';

class App extends React.Component {
  render() {
    return (
      <div>
        <h1>Medical Prognosis</h1>
        <h2>Preventing Heart Attack and other serious medical conditions</h2>
      


        <form>
          <p>
            <label>
              Name  (as per records)
    <input type="text" name="name" />

            </label>
          </p>
          <p>
          <label>
            Age  (in Years)
            <input type="text" name="Age" />
            
          </label>
          </p>
          <p>
          <label>
            Blood Pressure (BP)
          <input type="text" name="BP" />

          </label>
          </p>
          <p>
          <label>
         Blood Oxygen Level : 
         </label>
          <input type="text" name="SPO2" />
          </p>
          <p>
          <label>
          Electrocardiography (ECG)
          <input type="text" name="ECG" />
         
          </label>
          </p>
          <p>
          <label>
            Heart Rate (in bpm)
          <input type="text" name="Heart Rate" />
          </label>
          </p>
          <p>
          <label>
            Submit
          <input type="submit" value="submit" />
          </label>
          </p>
        </form>
        <p>Developed by Siddarth Pai</p>
      </div>

      

    );
  }
}
export default App;