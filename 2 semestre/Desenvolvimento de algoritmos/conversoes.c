//conversoes.c
#include "conversoes.h"
//temperatura
float celsiuspFahrenheit(float c) {
    return (c * 9 / 5) + 32;
}

float fahrenheitpCelsius(float f) {
    return (f - 32) * 5 / 9;
}

//distância
float metrospQuilometros(float m) {
    return m / 1000;
}

float quilometrospMetros(float km) {
    return km * 1000;
}

//tempo
float segundospMinutos(float s) {
    return s / 60;
}

float minutospSegundos(float min) {
    return min * 60;
}
