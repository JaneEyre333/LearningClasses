package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test // С1 - конструктор 1 (без параметра)
    public void shouldStationNextPlusOneC1() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(2);
        radio.setNext(true);
        radio.stationNext();
        int expected = 3;
        assertEquals(expected, radio.getCurrentStationNumber());
    }
    @Test // С2 - конструктор 2 (с максимальным количеством станций)
    public void shouldStationNextPlusOneC2() {
        Radio radio = new Radio(100);
        radio.setCurrentStationNumber(78);
        radio.setNext(true);
        radio.stationNext();
        int expected = 79;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldStationNextFromLastStationToZeroC1() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(radio.getStationsQuantity());
        radio.setNext(true);
        radio.stationNext();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldStationNextFromLastStationToZeroC2() {
        Radio radio = new Radio(50);
        radio.setCurrentStationNumber(radio.getStationsQuantity());
        radio.setNext(true);
        radio.stationNext();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

//    @Test
//    public void shouldFailStationNext() {
//        Radio radio = new Radio();
//        radio.setCurrentStationNumber(9);
//        radio.setNext(true);
//        radio.stationNext();
//        int expected = 10;
//        assertEquals(expected, radio.getCurrentStationNumber());
//    }

    @Test
    public void ShoulduStationPrevFromZeroToMaxC1() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(radio.getStationsQuantity());
        radio.setPrev(true);
        radio.stationPrev();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void ShoulduStationPrevFromZeroToMaxC2() {
        Radio radio = new Radio(100);
        radio.setCurrentStationNumber(0);
        radio.setPrev(true);
        radio.stationPrev();
        int expected = radio.getStationsQuantity();
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void ShoulduStationPrevMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(7);
        radio.setPrev(true);
        radio.stationPrev();
        int expected = 6;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

//    @Test
//    public void ShouldFailStationPrev() {
//        Radio radio = new Radio();
//        radio.setCurrentStationNumber(0);
//        radio.setPrev(true);
//        radio.stationPrev();
//        int expected = 1;
//        assertEquals(expected, radio.getCurrentStationNumber());
//    }

    @Test
    public void shouldChangeSoundVolumeUpByOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.setSoundLouder(true);
        radio.changeSoundVolumeUp();
        int expected = 1;
        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldChangeSoundVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.setSoundLouder(true);
        radio.changeSoundVolumeUp();
        int expected = 100;
        assertEquals(expected, radio.getCurrentSoundVolume());
    }

//    @Test
//    public void shouldFailChangeSoundVolumeUp() {
//        Radio radio = new Radio();
//        radio.setCurrentSoundVolume(0);
//        radio.setSoundLouder(true);
//        radio.changeSoundVolumeUp();
//        int expected = 10;
//        assertEquals(expected, radio.getCurrentSoundVolume());
//    }

    @Test
    public void shouldChangeSoundVolumeDownByOne() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(5);
        radio.setSoundLower(true);
        radio.changeSoundVolumeDown();
        int expected = 4;
        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldChangeSoundVolumeDownMin() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.setSoundLower(true);
        radio.changeSoundVolumeDown();
        int expected = 0;
        assertEquals(expected, radio.getCurrentSoundVolume());
    }

//    @Test
//    public void shouldFailChangeSoundVolumeDown() {
//        Radio radio = new Radio();
//        radio.setCurrentSoundVolume(10);
//        radio.setSoundLower(true);
//        radio.changeSoundVolumeDown();
//        int expected = 0;
//        assertEquals(expected, radio.getCurrentSoundVolume());
//    }
}

