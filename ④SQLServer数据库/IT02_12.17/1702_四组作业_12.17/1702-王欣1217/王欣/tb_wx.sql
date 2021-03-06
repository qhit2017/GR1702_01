USE [db_worker]
GO
/****** Object:  Table [dbo].[Ta_1wx]    Script Date: 12/17/2017 19:29:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ta_1wx](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[age] [tinyint] NOT NULL,
	[salary] [money] NOT NULL,
	[department] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Ta_1wx] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
