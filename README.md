# The Josephus Problem

Given 2 variables, `n` and `k`, where `n` is the number of participants and
`k` is the interval, return the last position to be consumed.

Note that the position returned is `1`-indexed.

## Usage

### Command-Line

Use `sbt run`

```bash
sbt "run n k"
```

### In Code

```scala
import com.adamstrickland.josephus._
Josephus.solve(7, 3) // 4
```

## Running Tests

```bash
sbt test
```
