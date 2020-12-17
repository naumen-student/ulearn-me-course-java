# Задание 01 Запуск процесса

Напишите код, который позвляет извлечь название звукового трека из mp3-файла.

Для этого вам понадобится программа ffmpeg, установите ее отсюда - http://ffmpeg.org/download.html

Пример команды для получения нужной информации:
```
ffprobe -v error -of flat -show_format file.mp3
```

Формат ответа на команду:
```
...
format.tags.title="Canon trias harmonica a 8"
format.tags.album="Canons"
format.tags.artist="Johann Sebastian Bach"
format.tags.genre="Classical"
```

- Запустите эту команду как подпроцесс из java
- Найдите в выводе свойство "format.tags.title"
- Верните из метода extractSoundName значение этого свойства
