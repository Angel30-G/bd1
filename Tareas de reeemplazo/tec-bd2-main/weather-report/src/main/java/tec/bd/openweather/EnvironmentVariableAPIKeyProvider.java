/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.openweather;


public class EnvironmentVariableAPIKeyProvider implements OpenWeatherAPIKeyProvider {

    private static final String OW_API_KEY_ENV_VAR_NAME = "OW_API_KEY";

    public EnvironmentVariableAPIKeyProvider() {

    }

    @Override
    public String getAPIKey() {
        return System.getenv(OW_API_KEY_ENV_VAR_NAME);
    }
}
